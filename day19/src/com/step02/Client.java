package com.step02;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int port = 6000;
		Socket sock = null;
		OutputStream os = null;
		PrintStream ps = null;
		try {
			sock = new Socket(InetAddress.getByAddress(new byte[] {(byte)172,20,10,3}),port);
			os = sock.getOutputStream();
			ps = new PrintStream(os);
			while(true) {
				System.out.print("client>> ");
				String msg = sc.nextLine();
//				ps.println(msg);
				ps.write(msg.getBytes());
				ps.write("\n".getBytes());
				ps.flush();
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(sock!=null) sock.close();
				if(os!=null) os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
