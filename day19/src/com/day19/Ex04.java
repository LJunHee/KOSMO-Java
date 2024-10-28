package com.day19;


import java.io.*;
import java.net.*;


public class Ex04 {
	// server
	public static void main(String[] args) {
		int port = 6000;
		ServerSocket serv = null;
		Socket sock = null;
		InputStream is = null;
		OutputStream os = null;
		
		try {
			serv = new ServerSocket(port);
			System.out.println("waiting...");
			sock = serv.accept();
			System.out.println("connection...");
			InetAddress addr = sock.getInetAddress();
			
			is = sock.getInputStream();
			os = sock.getOutputStream();
			byte[] buf = new byte[10];
			is.read(buf);
			
			System.out.println("connect : " + addr);
			System.out.println(new String(buf));
			os.write("welcome".getBytes());
			while(true) {
				int su = is.read();
				if(su==-1) break;
				System.out.println((char)su);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(os!=null) os.close();
				if(is!=null) is.close();
				if (sock != null) sock.close();
				if(serv!=null) serv.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
