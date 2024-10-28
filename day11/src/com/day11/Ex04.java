package com.day11;

class Box03 {
	public static <T> T func01(T pen) {
		Box<T> box = new Box<T>();
		box.setPen(pen);
		return box.getPen();
	}
}

public class Ex04 {

	public static void main(String[] args) {
		Pencil pen = Box03.<Pencil>func01(new Pencil());
		pen.draw();
	}

}
