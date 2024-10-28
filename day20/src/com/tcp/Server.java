package com.tcp;


import java.io.*;
import java.net.*;
import java.util.*;


public class Server extends Thread {
	static Map<String, PrintStream> map;
	String id;
	InputStream is;


	public Server(String id, InputStream is) {
		this.id = id;
		this.is = is;
	}


	@Override
	public void run() {
		try (
		    InputStreamReader isr = new InputStreamReader(is);
		    BufferedReader br = new BufferedReader(isr);
		) {
			String msg = "";
			while (true) {
				msg = br.readLine();
				Set<String> keys = map.keySet();
				Iterator<String> ite = keys.iterator();
				while (ite.hasNext()) {
					String key = ite.next();
					try {
						PrintStream ps = map.get(key);
						ps.println(id + ">>" + msg);
						ps.flush();
					} catch (Exception e) {
						map.remove(key);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		map = new HashMap<String, PrintStream>();
		try (ServerSocket serv = new ServerSocket(6000)) {
			while (true) {
				Socket sock = serv.accept();
				String id = sock.getInetAddress().getHostAddress();
				InputStream is = sock.getInputStream();
				OutputStream os = sock.getOutputStream();
				PrintStream ps = new PrintStream(os);
				map.put(id, ps);
				Server me = new Server(id, is);
				me.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}