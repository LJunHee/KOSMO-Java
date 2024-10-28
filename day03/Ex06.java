/*
 * 클래스의 구성요소
 * 2. 변수
 * 2-1. 클래스 변수(static)
 * 2-2. 멤버 필드(non-static)
 *
 *
 */
public class Ex06 {

    public static int su1 = 1111;
    public int su2 = 2222;
    public static int su3; // 기본값 0
    // su3=3333; //불가능
    public static String msg = null;

    public static void func01(){
        System.out.println(su1);
        Ex06 me = new Ex06();
        System.out.println(me.su2);
    }

    public static void main(String[] args) {
        System.out.println(su1);
        Ex06 me = new Ex06();
        System.out.println(su1);
        System.out.println(me.su2);
        System.out.println();

    }
}
