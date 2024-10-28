package com.tcp;


import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;


public class Client extends Frame implements ActionListener {
	static TextArea ta;
	TextField tf;
	static PrintStream ps;


	public Client() {
		setLayout(new BorderLayout());
		ta = new TextArea();
		add(ta, BorderLayout.CENTER);
		tf = new TextField();
		tf.addActionListener(this);
		add(tf, BorderLayout.SOUTH);
		setBounds(500, 500, 300, 500);
		setVisible(true);
	}


	public static void main(String[] args) {
		Client me = new Client();
		InputStream is = null;
		OutputStream os = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try (
		    Socket sock = new Socket("127.0.0.1", 6000);
		) {
			is = sock.getInputStream();
			os = sock.getOutputStream();
			ps = new PrintStream(os);
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);

			String msg = null;
			while (true) {
				msg = br.readLine();
				ta.appendText(msg + "\n");
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String msg = e.getActionCommand();
		ps.println(msg);
		ps.flush();
		tf.setText("");
	}

}