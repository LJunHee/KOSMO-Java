public class Ex02 {
   /*
    * 클래스의 구성요소
    * 1. 메서드
    * 1.1 static 메서드
    * public static 리턴타입 메서드명(매개변수) {실행코드}
    *
    * @메서드명
    * 키워드X
    * 문자(시작 소문자)
    * 특수문자 _$ 만 사용가능하지만 안쓰는것을 추천 (할수 있으나 하지 않는다)
    * 카멜케이스로 작성
    *
    * @리턴타입
    * 메서드 말단의 리턴의 타입
    * 리턴 값이 없을 경우 void
    *
    * 메서드의 호출은
    * 메서드명()
    * 메서드명(매개변수값)
    * 메서드명(매개변수값,매개변수값,...)
    *
    * @매개변수=파라미터,인자,arguments
    * (타입 이름, 타입 변수명,...)
    *
    *
    *
    */
   public static void main(String[] args) {
      System.out.println("시작");
      func01(2);
      func01(3);
      // int su = func01(3);
      System.out.println("종료");
      return;
   }

   public static void func01(int dan) {
      System.out.println("구구단 " + dan + "단 출력");
      // int dan = 2;
      for (int i = 1; i < 10; i++) {
         System.out.println(dan + " x " + i + " = " + dan * i);
         if(i==2) return;
      }
      // System.out.println(dan + " x " + 1 + " = " + dan*1);
      // System.out.println(dan + " x " + 2 + " = " + dan*2);
      // System.out.println(dan + " x " + 3 + " = " + dan*3);
      // System.out.println("~~~~~~~~");
      // System.out.println(dan + " x " + 9 + " = " + dan*9);
   }
}
