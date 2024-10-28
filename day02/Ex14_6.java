public class Ex14_6 {
    public static void main(String[] args) {

      for(int i = 1; i<7; i++) {
        System.out.print(i + " ");
        if(i == 1 || i == 3) {
          System.out.println();
        }
      }
      System.out.println();
      System.out.println("======================2");

      int m =1;
      for(int i=2; i<5; i++) {
        for(int j=1; j<i; j++) {
          System.out.print(m++ + " ");
        }
        System.out.println();
      }
    }
}
