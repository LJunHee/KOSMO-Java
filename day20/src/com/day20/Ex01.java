package com.day20;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class Ex01 extends Frame implements ActionListener {
	static JButton[] btns;
	static Panel center;
	Label cnt, time;
	Button begin;
	int score, sec = 10;


	public Ex01() {
		setLayout(new BorderLayout());
		Panel top = new Panel();
		Panel bottom = new Panel();
		center = new Panel();
		Panel right = new Panel();

		Font title = new Font("궁서체", Font.BOLD, 24);

		top.setLayout(new GridLayout(1, 2));
		center.setLayout(new GridLayout(4, 4));
		right.setLayout(new GridLayout(4, 1));

		Label ltitle = new Label("두더지게임", Label.LEFT);
		ltitle.setFont(title);
		top.add(ltitle);

		time = new Label(sec + "초", Label.RIGHT);
		top.add(time);

		cnt = new Label(score + "점");
		bottom.add(cnt);

		right.add(new Label());
		begin = new Button("시작");
		begin.addActionListener(this);

		right.add(begin);

		Button exit = new Button("종료");
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		right.add(exit);

		btns = new JButton[16];
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new JButton();
			btns[i].setEnabled(false);
			if (i < 4) {
				btns[i].addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						score++;
						cnt.setText(score + "점");
					}
				});
				Icon icon = new ImageIcon("game1.png");
				btns[i].setIcon(icon);
			} else {
				btns[i].addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						score--;
						cnt.setText(score + "점");
					}
				});
				Icon icon = new ImageIcon("game2.png");
				btns[i].setIcon(icon);
			}
			center.add(btns[i]);
		}

		add(top, BorderLayout.NORTH);
		add(bottom, BorderLayout.SOUTH);
		add(center, BorderLayout.CENTER);
		add(right, BorderLayout.EAST);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		setBounds(500, 100, 1000, 800);
		setVisible(true);
	}


	public static void main(String[] args) {
		Ex01 me = new Ex01();

	}


	Random ran = new Random();


	public void mix() {
		int end = sec;
		for (int j = 0; j < 10; j++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			for (int i = 0; i < 100; i++) {
				int su = ran.nextInt(16);
				center.add(btns[su]);
			}
			time.setText(--sec + "초");
			this.validate();
		}
		for (int i = 0; i < btns.length; i++) {
			btns[i].setEnabled(false);
		} 
		begin.setEnabled(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		sec = 3;
		score = 0;
		begin.setEnabled(false);
		for (int i = 0; i < btns.length; i++) {
			btns[i].setEnabled(true);
		}

		Thread thr = new Thread(new Runnable() {
			@Override
			public void run() {
				mix();
			}
		});
		thr.setDaemon(true);
		thr.start();

	}
}
