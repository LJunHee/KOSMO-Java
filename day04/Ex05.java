package day04;

public class Ex05 {
    public static int su1;
    public final int su2;

    public Ex05() {
        su2=2222;
    }

    public static void main(String[] args) {
        Ex05 me = new Ex05();
        // su1++;
        System.out.println(me.su1);
        // su2++;
        System.out.println(me.su2);
        int a;
        a = 1111;
        a = 1000;
        System.out.println(a);
        final int b; // 상수형 변수
        b = 2222;
        // b = 2000;
        System.out.println(b);
    }
}
