package com.day19;


import java.io.*;
import java.net.*;


public class Ex03 {

	public static void main(String[] args) {
		URLConnection conn = null;
		URL url = null;
		InputStream in = null;
		InputStreamReader isr = null;

		String spec = "https://www.weather.go.kr/w/index.do#dong/4825059000/35.2493126351167/128.901884444854/%EA%B2%BD%EB%82%A8%20%EA%B9%80%ED%95%B4%EC%8B%9C%20%EC%96%B4%EB%B0%A9%EB%8F%99/SCH/%EC%9D%B8%EC%A0%9C%EB%8C%80%ED%95%99%EA%B5%90%20%EC%9E%A5%EC%98%81%EC%8B%A4%EA%B4%80";
		// String spec = "https://www.7-zip.org/a/7z2408-x64.ext";
		// File f = new File("www.daum.net");
		OutputStream out = null;
		//
		// BufferedInputStream bis = null;
		// BufferedOutputStream bos = null;
		try {
			url = new URL(spec);
			conn = url.openConnection(); // 서버에 접속
			in = conn.getInputStream();
			// bis = new BufferedInputStream(in);
			// bos = new BufferedOutputStream(out);
			// byte[] buf = new byte[128];
			// while(true) {
			// int su = bis.read();
			// if(su==-1) break;
			// out.write(buf,0,su);
			// }
			isr = new InputStreamReader(in,"UTF-8");
			String msg = "";
			while (true) {
				int su = in.read();
				if (su == -1) break;
				msg += ((char)su);
			}
			
			System.out.println("다운로드 완료");
			int beginIdx = msg.indexOf("시간별 예보");
			int endIdx = msg.indexOf("<!-- 누리집 안내지도 -->");
			msg = msg.substring(beginIdx,endIdx);
			msg = msg.replaceAll("<", "");
			System.out.println(msg);
			// bos.close();
			// bis.close();
//			out.close();
			isr.close();
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
