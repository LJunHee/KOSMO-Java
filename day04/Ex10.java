package day04;
/*
 * 계산기(ver 0.1.0)
 *
 * 첫번째 숫자입력>
 * 두번째 숫자입력>
 * 1.+ 2.- 3.* 4./ 0.종료
 * 5*3=15
 *
 * 1.+ 2.- 3.* 4./ 0.종료
 *
 */

public class Ex10 {

    public static void plus(int firNum, int secNum) {
        int result = firNum + secNum;
        System.out.println(firNum + " + " + secNum + " = " + (int) result);
    }
    public static void minus(int firNum, int secNum) {
        int result = firNum - secNum;
        System.out.println(firNum + " - " + secNum + " = " + (int) result);
    }
    public static void mul(int firNum, int secNum) {
        int result = firNum * secNum;
        System.out.println(firNum + " x " + secNum + " = " + (int) result);
    }
    public static void div(int firNum, int secNum) {
        if (firNum % secNum == 0) {
            double result = firNum / secNum;
            System.out.println(firNum + " ÷ " + secNum + " = " + (int) result);
        } else {
            double result = firNum / secNum;
            double otherResult = ((double) (firNum % secNum)) / secNum;
            System.out.println(firNum + " ÷ " + secNum + " = " + (result + (otherResult)));
        }
    }

    public static void main(String[] args) {
        boolean run = true;
        double result = 0;

        System.out.println("-----------------");
        System.out.println("계산기(ver 0.1.0)");

        while (run) {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.print("1. + 2. - 3. x 4. ÷ 0. 종료 >");
            int sign = sc.nextInt();
            if(sign != 0){
                System.out.print("첫번째 숫자입력> ");
                int firNum = sc.nextInt();
                System.out.print("두번째 숫자입력> ");
                int secNum = sc.nextInt();

                switch (sign) {
                    case 1:
                        plus(firNum, secNum);
                        continue;
                    case 2:
                        minus(firNum,secNum);
                        continue;
                    case 3:
                        mul(firNum,secNum);
                        continue;
                    case 4:
                        div(firNum,secNum);
                        continue;
                }
            } else {
                System.out.println("이용해주셔서 감사합니다.");
                run = false;
            }

        }
    }
}
