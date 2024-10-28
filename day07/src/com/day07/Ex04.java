package com.day07;

//안녕
class Machine {
	public void on() {
		System.out.println("전원을 켜다.");
	}
	public void off() {
		System.out.println("전원을 끄다.");
	}

	public void work() {}
}

class TV extends Machine {
	public void work() {
		System.out.println("주파수를 잡아 화면을 보여주다.");
	}
}

class Radio extends Machine {
	public void work() {
		System.out.println("주파수를 잡아 소리를 들려주다.");
	}
}

class Audio extends Machine {
	@Override
	public void work() {
		System.out.println("CD음악을 들려주다.");
	}
}

public class Ex04 {
	public static void main(String[] args) {
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);
		int input = 0;
		Machine remote = null;

		while (true) {
			System.out.print("1.TV 2.라디오 3.오디오 0.종료 >");
			input = sc.nextInt();
			if (input == 0) break;
			if (input == 1) {
				remote = new TV();
			} else if (input == 2) {
				remote = new Radio();
			} else if (input == 3) {
				remote = new Audio();
			}
			remote.on();
			remote.work();
			remote.off();
		}
	}

}
