package day04;
public class Ex11_1 {
    public static void main(String[] args) {
        for(int su=1; su<10; su++){
            for (int dan = 2; dan < 10; dan++) {
                System.out.print(dan + "x" + su + "=" + (dan * su) + "\t");
            }
            System.out.println();
        }
    }
}
