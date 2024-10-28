package com.day19;


import java.io.*;
import java.net.*;


public class Ex05 {
	// client
	public static void main(String[] args) {
		byte[] ip = new byte[] { (byte) 172, 20, 10, 3 };
		int port = 6000;
		Socket sock = null;
		OutputStream os = null;
		InputStream is = null;
		
		try {
			InetAddress addr = InetAddress.getByAddress(ip);
			sock = new Socket(addr,port); // 서버접속...
			os = sock.getOutputStream();
			is = sock.getInputStream();
			
			os.write("hello java".getBytes());
			while(true) {
				int su = is.read();
				if(su==255) break;
				System.out.print((char)su);
			}
			os.write("me too".getBytes());
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(is!=null)is.close();
				if(os!=null)os.close();
				if(sock!=null)sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
