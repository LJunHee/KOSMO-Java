package com.day11;

interface Pen {
	void draw();
}

class Ball {
    public void play() {
        System.out.println("공놀이한다");
    }
}

class Ballpen implements Pen {
	String bold = "굵은";
	public void draw() {
		System.out.println(bold + "선을 긋습니다");
	}
}

class Pencil implements Pen {
	String bold = "희미한";
	public void draw() {
		System.out.println(bold + "선을 긋습니다");
	}
}

class Box<T> {
	T pen;
	public void setPen(T pen) {
		this.pen = pen;
	}
	
	public T getPen() {
		return this.pen;
	}
}

public class Ex02 {

	public static void main(String[] args) {
		Pencil pen1 = new Pencil();
		Ballpen pen3 = new Ballpen();
		Ball ball = new Ball();
		
		Box<Ballpen> box = new Box<Ballpen>();
		Box<Pencil> box2 = new Box<Pencil>();
		
		box.setPen(pen3);
		box2.setPen(pen1);
		//~~~
		Ballpen pen4 = box.getPen();
		pen4.draw();
		Pencil pen5 = box2.getPen();
		pen5.draw();
		
		Box<Ball> box3 = new Box<Ball>();
		box3.setPen(new Ball());
		ball.play();
		Box<String> box4 = new Box<String>();
		box4.setPen("hello");
		String msg = box4.getPen();
		System.out.println(msg);
	}

}
