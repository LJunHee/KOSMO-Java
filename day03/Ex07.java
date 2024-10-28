public class Ex07 {
    public static void main(String[] args) {
        // 절차 지향
        int speed = 0;
        System.out.println("내차의 현재 속도는 " + speed + "km입니다.");
        for (int i = 0; i < 20; i++) {
            speed = speedUp(speed);
            System.out.println("내차의 현재 속도는 " + speed + "km입니다.");
        }
        for (int i = 0; i < 10; i++) {
            speed = speedDown(speed);
            System.out.println("내차의 현재 속도는 " + speed + "km입니다.");
        }
    }

    public static int speedUp(int a) {
        a += 5;
        return a;
    }

    public static int speedDown(int a) {
        a -= 10;
        return a;
    }
}
