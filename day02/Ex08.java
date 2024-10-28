public class Ex08 {
    public static void main(String[] args) {
        //제어문
        //1. 조건문(switch)
        int su = 1;
        switch (su) {
            case 3:
                System.out.println("삼");
                break;
            case 2:
                System.out.println("이");
                break;
            case 1:
                System.out.println("일");
                break;
            default: //선택
                System.out.println("몰라");
                break;
        }
    }
}
