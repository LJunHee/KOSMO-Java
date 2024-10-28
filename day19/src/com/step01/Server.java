package com.step01;
import java.io.*;
import java.net.*;

public class Server {	
	//다중 접속 허용
	public static void main(String[] args) {
		int port = 6000;
		ServerSocket serv = null;
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			serv = new ServerSocket(port);
			while(true) {
				Socket sock = serv.accept();
				is = sock.getInputStream();
				isr = new InputStreamReader(is);
				br = new BufferedReader(isr);
				while(true) {
					String msg = br.readLine();
					System.out.println(sock.getInetAddress().getHostAddress() + ">> " + msg);					
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(serv!=null) serv.close();
				if(is!=null) is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}			
		}
	}
}
