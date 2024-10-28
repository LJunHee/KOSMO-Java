public class Ex14_7 {
    public static void main(String[] args) {
      int sum = 0;
      for(int i=1; i<=100; i++) {
        if(i % 2 == 0) {
          sum += i;
        }
      }
      System.out.println("짝수의 합 : " + sum);
    }

}
