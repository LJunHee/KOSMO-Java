package com.day08;

class MyList{
	Stu[] arr;
	public MyList() {
		arr=new Stu[0];
	}
	public void add(Stu su) {
		int cnt=arr.length+1;
		Stu[] temp=new Stu[cnt];
		//기존값복사
//		System.arraycopy(arr, 0, temp, 0, cnt-1);
		for(int i=0; i<arr.length; i++) {
			temp[i]=arr[i];
		}
		arr=temp;
		arr[cnt-1]=su;
	}
	
	public void remove(int idx) {
		Stu[] temp=new Stu[arr.length-1];
		for(int i=0; i<idx; i++) {
			temp[i]=arr[i];
		}
		for(int i=idx+1; i<arr.length; i++) {
			temp[i-1]=arr[i];
		}
		arr=temp;
	}
	public int size() {
		return arr.length;
	}
	public Stu get(int idx) {
		return arr[idx];
	}
}

public class Ex15 {
	public static void main(String[] args) {
		String menu="1.보기 2.입력 3.수정 4.삭제 0.종료>";
		java.util.Scanner sc;
		sc=new java.util.Scanner(System.in);
		System.out.println("학생성적관리프로그램(ver 1.5.0)");
		String input=null;
		MyList stuInfo=new MyList();
		while(true) {
			System.out.print(menu);
			input=sc.nextLine();
			if(input.equals("0"))break;
			if(input.equals("1")) {
				System.out.println("--------------------------------------------------");
				System.out.println("학번\t|이름\t|국어\t|영어\t|수학\t|합계\t|평균");
				System.out.println("--------------------------------------------------");
				for(int i=0; i<stuInfo.size(); i++) {
					Stu stu=stuInfo.get(i);
					System.out.println(stu.num+"\t|"+stu.name+"\t|"+stu.kor+"\t|"
					+stu.eng+"\t|"+stu.math+"\t|"+stu.total()+"\t|"+stu.avg());
				}
				System.out.println("--------------------------------------------------");
			}
			if(input.equals("2")) {
				Stu stu=new Stu();
				System.out.print("이름>");
				stu.name=sc.nextLine();
				System.out.print("국어>");
				stu.kor=Integer.parseInt(sc.nextLine());
				System.out.print("영어>");
				stu.eng=Integer.parseInt(sc.nextLine());
				System.out.print("수학>");
				stu.math=Integer.parseInt(sc.nextLine());
				stuInfo.add(stu);
			}
			if(input.equals("3")) {
				System.out.print("수정할 학번>");
				int num=Integer.parseInt(sc.nextLine());
				int idx=-1;
				for(int i=0; i<stuInfo.size(); i++) {
					if(stuInfo.get(i).num==num) idx=i;
				}
				if(idx>-1) {
					Stu stu=stuInfo.get(idx);
					System.out.print("이름>");
					stu.name=sc.nextLine();
					System.out.print("국어>");
					stu.kor=Integer.parseInt(sc.nextLine());
					System.out.print("영어>");
					stu.eng=Integer.parseInt(sc.nextLine());
					System.out.print("수학>");
					stu.math=Integer.parseInt(sc.nextLine());
				}else {
					System.out.println(num+"학번은 존재하지 않습니다");
				}
			}
			if(input.equals("4")) {
				System.out.print("삭제할 학번>");
				int num=Integer.parseInt(sc.nextLine());
				int idx=-1;
				for(int i=0; i<stuInfo.size(); i++) {
					Stu stu=stuInfo.get(i);
					if(stu.num==num)idx=i;
				}
				if(idx>-1)stuInfo.remove(idx);
			}
		}
		System.out.println("이용해주셔서 감사합니다.");
		
	
	}
	
	
}