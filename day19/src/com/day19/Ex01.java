package com.day19;
import java.net.*;

public class Ex01 {

	public static void main(String[] args) {
		InetAddress inet01 = null;
		InetAddress[] inets = null;
		//hosts -> node Root -> DNS
		String host = "google.com";
		
		try {
//			inet01 = InetAddress.getByName(host);
//			System.out.println(inet01.getHostName());
//			System.out.println(inet01.getHostAddress());
//			System.out.println(inet01.getCanonicalHostName()); // 실질서버
//			inets = InetAddress.getAllByName(host);				
//			for(int i =0; i<inets.length; i++) {
//				InetAddress inet = inets[i];
//					System.out.println(inet.getHostName());
//					System.out.println(inet.getHostAddress());
//					System.out.println(inet.getCanonicalHostName()); // 실질서버
//			}
			// 0.0.0.0 ~ 255.255.255.255
			
			byte[] addr= new byte[] {(byte)172,(byte)217,(byte)161,(byte)238};
			inet01 = InetAddress.getByAddress(addr);
		} catch(UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
