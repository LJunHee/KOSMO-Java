package com.day19;
import java.net.*;

public class Ex02 {

	public static void main(String[] args) {
		URL url = null;
		try {
			String path = "https://getbootstrap.com/docs/3.4/components/#navbar";
			url = new URL(path);
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort());
			System.out.println(url.getDefaultPort());
			System.out.println(url.getFile());
			System.out.println(url.getPath());
			System.out.println(url.getQuery());
			System.out.println(url.getAuthority());
			System.out.println(url.getRef());
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
