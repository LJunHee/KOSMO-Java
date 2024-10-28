package com.step03;


import java.net.*;
import java.util.ArrayList;
import java.io.*;
import java.net.*;


public class Server extends Thread implements Runnable {
	BufferedReader br;
	String ip;
	static ArrayList<PrintStream> list;


	public Server(BufferedReader br,String ip) {
		this.br = br;
		this.ip = ip;
	}

	public void sendAll(String msg) {
		for(int i = 0; i<list.size(); i++) {
			Socket sock = list.get(i);
			try(
				OutputStream os = sock.getOutputStream();
				PrintStream ps = new PrintStream(os);
				) {
				
			}
			PrintStream ps = list.get(i);
			ps.println(msg);
			ps.flush();
		}
	}
	
	@Override
	public void run() {
		try {
			while (true) {
				String msg = br.readLine();
				System.out.println(msg);
				sendAll(ip+" >> " +msg);
			}
		} catch (IOException e) {
			list.remove(sock);
		}
	}

	public static void main(String[] args) {
		list = new ArrayList<>();
		try (
		    ServerSocket serv = new ServerSocket(6000);
		) {
			while (true) {
				Socket sock = serv.accept();
				InputStream is = sock.getInputStream();
				OutputStream os = sock.getOutputStream();

				PrintStream ps = new PrintStream(os);
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);

				Server me = new Server(br,sock.getInetAddress().getHostAddress());
				Thread thr = new Thread(me);
				thr.start();
				list.add(ps);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
