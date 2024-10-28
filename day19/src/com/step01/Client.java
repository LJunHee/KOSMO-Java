package com.step01;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int port = 6000;
		Socket sock = null;
		OutputStream os = null;
		InputStream is = null;
		PrintStream ps = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			sock = new Socket(InetAddress.getByAddress(new byte[] {(byte)172,20,10,3}),port);
			os = sock.getOutputStream();
			is = sock.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			ps = new PrintStream(os);
			while(true) {
				System.out.print("client>> ");
				String msg = sc.nextLine();
				ps.println(msg);
				ps.flush();
				String result = br.readLine();
				System.out.println(result);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ps!=null) ps.close();
				if(os!=null) os.close();
				if(sock!=null) sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
