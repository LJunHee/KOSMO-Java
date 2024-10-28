package com.day11;

class Box05<T extends Pen> {
	T t;
	public void setT(T t) {
		this.t = t;
	}
	
	public T getT() {
		return t;
	}
	
	public void func01(java.util.List<? super Number> list) {
		
	}
}

public class Ex05 {

	public static void main(String[] args) {
		Ballpen pen1 = new Ballpen();
		Pencil pen2 = new Pencil();
		// 제네릭 추론타입 jdk 1.7~
//		Box05<Ballpen> box = new Box05<Ballpen>();
//		Box05<Ballpen> box = new Box05();
//		Box05 box = new Box05<Ballpen>();
//		Box05<?> temp = new Box05<>();
//		Box05<Ballpen> box = (Box05<Ballpen>) temp;
		
		Ball ball = new Ball();
		Box05<Ballpen> box = new Box05<>();
		
		box.setT(pen1);
		Pen pen5 = box.getT();
		pen5.draw();
		
		java.util.List<Object> list = null;
		box.func01(list);
	}

}
