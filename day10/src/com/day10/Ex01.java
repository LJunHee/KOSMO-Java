package com.day10;


class Node {
	int su;
	Node nxt;
}

class Linked {
	Node node;
	int cnt;


	void add(int su) {
		cnt++;
		Node temp = new Node();
		temp.su = su;
		if (cnt == 1) {
			this.node = temp;
		} else {
			Node temp2 = this.node;
			while (true) {
				if (temp2.nxt == null) break;
				temp2 = temp2.nxt;
			}
			temp2.nxt = temp;
		}
	}


	int get(int idx) {
		Node temp = this.node;
		for(int i = 0; i<idx; i++) {
			temp = temp.nxt;
		}
		return temp.su;		
	}

	int size() {
		return cnt;
	}

}

public class Ex01 {

	public static void main(String[] args) {
		Linked list = new Linked();
		list.add(1111);
		list.add(2222);
		list.add(3333);
		list.add(4444);
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
