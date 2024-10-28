package com.udp;

import java.io.IOException;
import java.net.*;

public class Sender {

	public static void main(String[] args) {
		byte[] ip = new byte[] {127,0,0,1};
		int port = 6000;
		DatagramSocket sock = null;
		DatagramPacket packet = null;
		try {
			InetAddress addr = InetAddress.getByAddress(ip);
			sock = new DatagramSocket();
			String msg = "한글도 됩니단";
			byte[] buf = msg.getBytes();
			packet = new DatagramPacket(buf, buf.length,addr,port);
			sock.send(packet);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(sock!=null) sock.close();
		}
	}

}
