public class Ex05 {
    public static void main(String[] args) {
        func01(1111,"한글");

    }

    /*
     * 메서드 오버로딩
     *
     * 원칙적으로 메서드명의 중복은 불가
     * 단, 다음의 세가지가 구분 가능하면 중복허용
     * 1. 매개변수의 유/무
     * 2. 매개변수의 타입
     * 3. 매개변수의 개수와 순서
     */
    public static void func01() {
        System.out.println("매개변수 없음");
    }

    public static void func01(int a) {
        System.out.println("매개변수 하나 있음" + a);
    }

    public static void func01(String a) {
        System.out.println("매개변수 하나 있음" + a);
    }

    public static void func01(int a, int b) {
        System.out.println("매개변수 하나 있음" + (a+b));
    }

    public static void func01(int a, String b) {
        System.out.println("매개변수 하나 있음" + (a+b));
    }

    public static void func01(String a, int b) {
        System.out.println("매개변수 하나 있음" + (a+b));
    }
}
