package day04;
public class Ex03 {
    public static void main(String[] args) {
        double su = Math.random();
        System.out.println("내가 만든 " + su);
        su = java.lang.Math.random();
        System.out.println("자바 -> " + su);

        su = Math.PI;
        System.out.println("내가 만든 " + su);
        su = java.lang.Math.PI;
        System.out.println("자바 -> " + su);
    }
}

class Math{
    public static double PI = 2.14;
    public static double random() {
        return 1.0;
    }
}
