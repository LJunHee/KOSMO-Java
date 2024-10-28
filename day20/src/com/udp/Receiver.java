package com.udp;
import java.io.IOException;
import java.net.*;
public class Receiver {

	public static void main(String[] args) {
		byte[] buf = new byte[5];
		DatagramSocket sock = null;
		DatagramPacket packet = null;
		
		try {
			sock = new DatagramSocket(6000);
			packet = new DatagramPacket(buf, buf.length);
			sock.receive(packet);
			System.out.println(new String(buf));
			
		} catch(SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(sock!=null) sock.close();
		}
	}

}
