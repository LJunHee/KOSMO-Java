package com.day13;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Ex13 extends Frame implements ActionListener {
	TextField[] labelInfo;
	TextField[][] tableInfo;
	Label[] labelArray;


	public Ex13() {
		setLayout(new BorderLayout());
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		//입력
		Panel input = new Panel();
		Font f = new Font(Font.SERIF, Font.BOLD, 20);

		String[] labels = { "학번", "이름", "국어", "영어", "수학" };
		labelArray = new Label[labels.length];
		labelInfo = new TextField[labels.length];

		for (int i = 0; i < labels.length; i++) {
			labelArray[i] = new Label(labels[i]);
			labelArray[i].setFont(f);
			labelInfo[i] = new TextField(10);
			input.add(labelArray[i]);
			input.add(labelInfo[i]);
		}

		Button submit = new Button("입력");
		submit.addActionListener(this);
		input.add(submit);

		add(input, BorderLayout.NORTH);

		// 성적 표
		Panel center = new Panel();
		center.setLayout(new GridBagLayout());
		GridBagConstraints bag = new GridBagConstraints();
		bag.fill = GridBagConstraints.BOTH;

		tableInfo = new TextField[4][5];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				bag.gridx = j;
				bag.gridy = i;
				tableInfo[i][j] = new TextField(10);
				center.add(tableInfo[i][j], bag);
			}
		}

		for (int i = 0; i < 4; i++) {
			bag.gridx = 5;
			bag.gridy = i;
			Panel setPanel = new Panel();
			Button edit = new Button("수정");
			Button del = new Button("삭제");
			int rowIndex = i;

			edit.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("Button edit Click");
				}
			});

			del.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for (int j = 0; j < tableInfo[rowIndex].length; j++) {
						tableInfo[rowIndex][j].setText("");
					}
				}
			});

			setPanel.add(edit);
			setPanel.add(del);
			center.add(setPanel, bag);
		}

		add(center, BorderLayout.CENTER);

		setBounds(1000, 500, 1000, 300);
		setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < tableInfo.length; i++) {
			if (tableInfo[i][0].getText().isEmpty()) {
				for (int j = 0; j < labelInfo.length; j++) {
					tableInfo[i][j].setText(labelInfo[j].getText());
				}
				break;
			}
		}
		
		for (int i = 0; i < labelArray.length; i++) {
			labelInfo[i].setText("");
		}
	}


	public static void main(String[] args) {
		new Ex13();
	}
}
