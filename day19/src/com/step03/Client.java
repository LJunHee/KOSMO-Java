package com.step03;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;

public class Client extends Frame implements ActionListener{
	TextField tf;
	static PrintStream ps;
	
	public Client() {
		tf = new TextField();
		tf.addActionListener(this);
		add(tf);
		setBounds(300,500,300,100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Client me = new Client();
		int port = 6000;
		try (
			Socket sock = new Socket("127.0.0.1",port);
			InputStream is = sock.getInputStream();
			OutputStream os = sock.getOutputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			)
		{
			ps = new PrintStream(os);
			while(true) {
				String msg = br.readLine();
				System.out.println(msg);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String msg = tf.getText();
		ps.println(msg);
		ps.flush();
	}

}
