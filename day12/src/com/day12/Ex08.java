package com.day12;
import java.awt.*;


//BorderLayout
public class Ex08 {

    public static void main(String[] args) {
        Frame f = new Frame();
        LayoutManager lm;
        lm = new BorderLayout();
        f.setLayout(lm);
        
        Button btn1 = new Button();
        btn1.setLabel("Top");
        f.add(btn1, BorderLayout.NORTH);

        Panel center = new Panel();
        Button btn2 = new Button();
        btn2.setLabel("Center");
        center.add(btn2);
        f.add(center,BorderLayout.CENTER);
        
        Button btn3 = new Button();
        btn3.setLabel("왼쪽");
        f.add(btn3, BorderLayout.WEST);
        
        Button btn4 = new Button();
        btn4.setLabel("오른쪽");
        f.add(btn4, "East");
        
        Button btn5 = new Button();
        btn5.setLabel("Bottom");
        f.add(btn5, "South");
        
        f.setLocation(1000, 500);
        f.setSize(500,400);
        f.setVisible(true);
    }

}
