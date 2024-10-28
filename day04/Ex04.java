package day04;

public class Ex04 {
    /*
     * 생성자
     * public 클래스명(매개변수){하고자하는 일}
     * 객체의 생성 시점에 하고자 하는일을 명세
     * 생성자코드 생략시 디폴트생성자를 자동 생성
     *
     * 디폴트생성자
     * public 클래스명(){}
     *
     * 생성자 오버로드
     * - 매개변수 유/무, 개수, 타입, 순서
     *
     */

    public Ex04() {
        System.out.println("매개변수없이 객체생성");
    }
    public Ex04(int a) {
        System.out.println("매개변수하나 " + a);
    }

    public void func01() {
        System.out.println("실행");
    }

    public static void main(String[] args) {
        Ex04 me = new Ex04(1234); //선언
        me.func01(); //초기화
    }
}
