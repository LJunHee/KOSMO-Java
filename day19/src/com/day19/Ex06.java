package com.day19;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Ex06 extends Thread {
	Font font = new Font(Font.SERIF, Font.BOLD, 40);
	Label time;
	JButton startButton, stopButton;
	final int realTime = 30;
	int remainingTime = 30;
	boolean running = false;
	Thread timerThread;


	@Override
	public void run() {
		running = true;
		while (remainingTime >= 0 && running) {
			time.setText("남은시간 : " + remainingTime + "초");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			remainingTime--;
		}

		if (!running) {
			time.setText("타이머 중지");
			remainingTime = realTime;
		}
	}


	public Ex06() {
		Frame f = new Frame();
		f.setLayout(new BorderLayout());
		f.setBounds(1000, 500, 600, 800);
		f.setVisible(true);

		// 상단
		Panel top = new Panel();
		top.setLayout(new FlowLayout());
		time = new Label("남은시간 :" + remainingTime + "초");
		time.setFont(font);
		top.add(time);
		f.add(top, BorderLayout.NORTH);

		// 중단
		ImageIcon game1Icon = new ImageIcon("game1.png");
		ImageIcon game2Icon = new ImageIcon("game2.png");

		Panel center = new Panel();
		center.setLayout(new GridBagLayout());
		JButton[][] btns = new JButton[4][];
		String[][] msg = {
		                { ".", ".", ".", "시작" },
		                { ".", ".", "." },
		                { ".", ".", ".", "종료" },
		                { ".", ".", "." }
		};
		GridBagConstraints bag = new GridBagConstraints();
		bag.fill = GridBagConstraints.BOTH;
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new JButton[msg[i].length];
			for (int j = 0; j < btns[i].length; j++) {
				bag.gridwidth = 1;
				bag.gridheight = 1;
				bag.weightx = 1.0;
				bag.weighty = 1.0;
				if (j == 3 && i == 0) bag.gridheight = 2;
				if (j == 3 && i == 2) bag.gridheight = 2;
				// JButton 생성
				if (msg[i][j].equals(".")) {
					if ((i + j) % 2 == 0) {
						btns[i][j] = new JButton(game1Icon);
					} else {
						btns[i][j] = new JButton(game2Icon);
					}
				} else {
					btns[i][j] = new JButton(msg[i][j]);
				}

				// 타이머 스레드
				if (msg[i][j].equals("시작")) {
					startButton = btns[i][j];
					startButton.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							if (!running) {
								startButton.setEnabled(false);
								stopButton.setEnabled(true);
								timerThread = new Thread(Ex06.this);
								timerThread.start();
							}
						}
					});
				}

				else if (msg[i][j].equals("종료")) {
					stopButton = btns[i][j];
					stopButton.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							if (running) {
								running = false;
								startButton.setEnabled(true);
								stopButton.setEnabled(false);
								try {
									if (timerThread != null) {
										timerThread.join();
									}
								} catch (InterruptedException ex) {
									ex.printStackTrace();
								}
								time.setText("종료");
							}
						}
					});
				}
				bag.gridx = j;
				bag.gridy = i;
				center.add(btns[i][j], bag);
			}
		}
		f.add(center, BorderLayout.CENTER);

		// 하단
		Panel bottom = new Panel();
		bottom.setLayout(new FlowLayout());
		Label score = new Label("점수 : ");
		score.setFont(font);
		bottom.add(score);
		f.add(bottom, BorderLayout.SOUTH);

	}


	public static void main(String[] args) {
		new Ex06();
	}

}
