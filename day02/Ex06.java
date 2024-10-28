public class Ex06 {
    public static void main(String[] args) {
        //제어문
        //1. 조건문(if)
        // if(조건) {실행}
        // if(조건) {실행} else {조건을 만족하지 못할때 실행} 실행을 보장
        // if(조건) {실행1} else if(조건) {실행2} else if(조건) {실행3}...
        System.out.println("조건 전");
        int su = 5;
        int a;
        // int su = 2;
        if(su > 3) {
            System.out.println("실행");
            a = 1234;
        } else {
            System.out.println("실행 안함");
            a = 4321;
        }
        System.out.println("조건 후");
    }
}
