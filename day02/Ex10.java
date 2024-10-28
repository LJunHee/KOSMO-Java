public class Ex10 {
  public static void main(String[] args) {
      // while(조건) {반복실행}

      int su = 1;
      while(true) {
        System.out.println("2 x " + su + " = " + (2*su));
        su++;
        if(su == 10) {
          break;
        }
      }
  }
}
