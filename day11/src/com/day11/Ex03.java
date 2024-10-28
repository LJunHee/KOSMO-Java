package com.day11;

class Box02<T1,T2> {
	T1 obj1;
	T2 obj2;
	
	public void setObj1(T1 obj1) {
		this.obj1 = obj1;
	}
	public void setObj2(T2 obj2) {
		this.obj2 = obj2;
	}
	public T1 getObj1() {
		return obj1;
	}
	public T2 getObj2() {
		return obj2;
	}
}

public class Ex03 {

	public static void main(String[] args) {
		Box02<Pencil,Ballpen> box = new Box02<Pencil,Ballpen>();
		box.setObj1(new Pencil());
		box.setObj2(new Ballpen());
		
		Pencil pen1 = box.getObj1();
		pen1.draw();
		Ballpen pen2 = box.getObj2();
		pen2.draw();

	}

}
