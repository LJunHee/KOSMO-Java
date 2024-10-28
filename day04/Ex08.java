package day04;

// 우선순위
// 지역 > 전역
public class Ex08 {
    // 전역변수
    public static int a = 9999;

    public static void main(String[] args) {
        int a = 1111; // 지역변수
        System.out.println(a);
        // System.out.println(Ex08.a);
        Ex08 me = new Ex08();
        System.out.println(me.a);
        me.func01();
    }

    public void func01() {
        int a = 1000;
        System.out.println(a);
        // System.out.println(Ex08.a);
        System.out.println(this.a);
    }
}
