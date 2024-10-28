public class Ex14_8 {
    public static void main(String[] args) {
      int sum = 0;
      for(int i=0; i<10; i++) {
        if(i % 2 == 1 && i != 9) {
          System.out.print(i + " + ");
          sum += i;
        } else if(i == 9) {
          System.out.print(i);
          sum += i;
        }
      }
      System.out.println(" = " + sum);

      int sum2 = 0;
      for(int i=1; i<11; i++){
        if(i%2==1) {
          sum2 += i;
          System.out.print(i);
        } else if(i == 10) {
          System.out.println("=" + sum2);
        } else {
          System.out.print("+");
        }
      }
    }
}
