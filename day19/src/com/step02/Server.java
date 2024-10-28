package com.step02;


import java.io.*;
import java.net.*;


public class Server extends Thread {
	Socket sock;
	
	public Server(Socket sock) {
		this.sock = sock;
	}
	@Override
	public void run() {
		String ip = sock.getInetAddress().getHostAddress();
		try(
			InputStream is = sock.getInputStream();
			OutputStream os = sock.getOutputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			PrintStream ps = new PrintStream(os);
			) {
			while(true) {
				String msg = br.readLine();
				ps.println(ip + ">>" + msg);
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		int port = 6000;
		ServerSocket serv = null;
		try {
			serv = new ServerSocket(port);
			while(true) {
				Socket sock = serv.accept();
				Server thr = new Server(sock);
				thr.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (serv != null) serv.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
