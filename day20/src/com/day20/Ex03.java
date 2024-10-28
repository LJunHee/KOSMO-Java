package com.day20;


import java.io.*;
import java.net.*;


//http protocol
public class Ex03 extends Thread {
	InputStream is;
	OutputStream os;


	public Ex03(Socket sock) throws IOException {
		is = sock.getInputStream();
		os = sock.getOutputStream();
	}


	// Content-Type: text/html; charset=UTF-8
	// Content-Type: text/plain; charset=MS949
	// Content-Type: image/png; charset=MS949
	@Override
	public void run() {
		try {
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String msg = br.readLine();
			System.out.println(msg);
			String[] arr = msg.split(" ");
			if (arr[1].equals("/")) arr[1] = "/index.html";
			File f = new File("./www" +arr[1]);
			InputStream is = new FileInputStream(f);
			os.write("HTTP/1.1 200 OK\n".getBytes());
			os.write("Content-Type: text/html; charset=MS949\n".getBytes());
			os.write("\n".getBytes());
			// os.write("<h1>테스트 페이지</h1>".getBytes());
			// os.write("<p>한글도 잘 나오나?</p>".getBytes());
			while (true) {
				int su = is.read();
				if (su == -1) break;
				os.write(su);
			}
			is.close();
			os.flush();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		// Web Server
		try (
		    ServerSocket serv = new ServerSocket(8080);
		) {
			while (true) {
				System.out.println("대기");
				new Ex03(serv.accept()).start();
				System.out.println("접속됨");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
