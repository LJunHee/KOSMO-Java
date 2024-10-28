package day04;

public class Ex11 {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            System.out.print(i + "단" + "\t");
            if (i == 9)
                System.out.println();
        }
        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.print(j + "x" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }

    }
}
