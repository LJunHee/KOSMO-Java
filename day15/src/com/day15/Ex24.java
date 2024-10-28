package com.day15;

import java.io.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// 메모장
public class Ex24 extends Frame {
    TextArea ta;

    public Ex24() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setTitle("제목없음");
        setBounds(600, 200, 1000, 1000);
        setVisible(true);

        // 구성요소
        ta = new TextArea("");
        Font f = new Font(Font.SERIF, Font.ROMAN_BASELINE, 40); 
        MenuBar mb = new MenuBar();
        setMenuBar(mb);
        Menu file = new Menu("파일");
        Menu help = new Menu("도움말");
        ta.setFont(f);
        add(ta);
        mb.add(file);
        mb.add(help);

        MenuItem newFile = new MenuItem("새파일");
        MenuItem open = new MenuItem("열기");
        MenuItem save = new MenuItem("저장");
        MenuItem quit = new MenuItem("종료");
        MenuItem info = new MenuItem("정보");

        newFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newFile();
            }
        });

        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                open();
            }
        });

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                save();
            }
        });

        info.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                information();
            }
        });

        quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        file.add(newFile);
        file.add(open);
        file.add(save);
        file.add(quit);
        help.add(info);
    }

    public void information() {
        Dialog dia = new Dialog(this, "정보", true);

        dia.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dia.dispose();
            }
        });
        dia.setLayout(new BorderLayout());

        Panel group = new Panel(new GridLayout(2, 1));
        Label infoTitle = new Label("메모장(0.1.0)");
        Label infoBody = new Label("내가 만듬 ");
        Font f = new Font(Font.SERIF, Font.BOLD, 30);
        infoTitle.setFont(f);

        group.add(infoTitle);
        group.add(infoBody);
        dia.add(group, BorderLayout.NORTH);
        dia.setTitle("메모장 정보");
        dia.setBounds(1200, 700, 600, 300);
        dia.setVisible(true);
    }

    public void newFile() {
		Frame newFileWindow = new Frame();
		newFileWindow.setBounds(600, 200, 1000, 1000);
		newFileWindow.setVisible(true);
		ta = new TextArea();
        Font f = new Font(Font.SERIF, Font.ROMAN_BASELINE, 40); 
        ta.setFont(f);
        newFileWindow.add(ta);
		
		newFileWindow.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				newFileWindow.dispose();
			}
		});
		
        MenuBar mb = new MenuBar();
        newFileWindow.setMenuBar(mb);
        Menu file = new Menu("파일");
        Menu help = new Menu("도움말");
        mb.add(file);
        mb.add(help);

        MenuItem newFile = new MenuItem("새파일");
        MenuItem open = new MenuItem("열기");
        MenuItem save = new MenuItem("저장");
        MenuItem quit = new MenuItem("종료");
        MenuItem info = new MenuItem("정보");

        newFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newFile();
            }
        });

        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                open();
            }
        });

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                save();
            }
        });

        info.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                information();
            }
        });

        quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newFileWindow.dispose();
            }
        });

        file.add(newFile);
        file.add(open);
        file.add(save);
        file.add(quit);
        help.add(info);
    }

    public void open() {
    	FileDialog openDia = new FileDialog(this, "파일 열기", 0);
    	Frame openWindow = new Frame();
    	TextArea openTa = new TextArea();
    	
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                openWindow.dispose();
            }
        });
        
        Font f = new Font(Font.SERIF, Font.ROMAN_BASELINE, 40); 
        openTa.setFont(f);
        openWindow.setBounds(600, 200, 1000, 1000);
        openWindow.setVisible(true);
        openWindow.add(openTa);
        openDia.setVisible(true);
        
        MenuBar mb = new MenuBar();
        openWindow.setMenuBar(mb);
        Menu file = new Menu("파일");
        Menu help = new Menu("도움말");
        mb.add(file);
        mb.add(help);

        MenuItem newFile = new MenuItem("새파일");
        MenuItem open = new MenuItem("열기");
        MenuItem save = new MenuItem("저장");
        MenuItem quit = new MenuItem("종료");
        MenuItem info = new MenuItem("정보");

        newFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newFile();
            }
        });

        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                open();
            }
        });

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                save();
            }
        });

        info.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                information();
            }
        });

        quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWindow.dispose();
            }
        });

        file.add(newFile);
        file.add(open);
        file.add(save);
        file.add(quit);
        help.add(info);
        
        String fileName = openDia.getFile();
        openWindow.setTitle(fileName);
        String directory = openDia.getDirectory();
        if (fileName == null || directory == null) {
            return; 
        }
        File openFile = new File(directory, fileName);

        try (
            InputStream in = new FileInputStream(openFile);
            InputStreamReader inr = new InputStreamReader(in, "UTF-8");
            BufferedReader bf = new BufferedReader(inr);
        ) {
            openTa.setText(""); 
            String line;
            while ((line = bf.readLine()) != null) {
                openTa.append(line + "\n");  
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void save() {
        FileDialog saveDia = new FileDialog(this, "파일 저장", 1);
        saveDia.setVisible(true);

        String fileName = saveDia.getFile();
        String directory = saveDia.getDirectory();
        if (fileName == null || directory == null) {
            return; 
        }

        File saveFile = new File(directory, fileName);

        try (
            OutputStream out = new FileOutputStream(saveFile);
            OutputStreamWriter outw = new OutputStreamWriter(out, "UTF-8");
            BufferedWriter bw = new BufferedWriter(outw);
        ) {
            bw.write(ta.getText());  
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Ex24();
    }
}
