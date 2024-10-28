public class Ex14_5 {
    public static void main(String[] args) {
      for(int i = 1; i<4; i++) {
        System.out.print(i + " ");
        if(i == 1) {
          break;
        }
      }
      System.out.println();

      for(int i = 1; i<4; i++) {
        System.out.print(i + " ");
        if(i == 2) {
          break;
        }
      }
      System.out.println();

      for(int i = 1; i<4; i++) {
        System.out.print(i + " ");
        if(i == 3) {
          break;
        }
      }

      System.out.println();
      System.out.println("======================2");

      int m = 1;
      for(int i=2; i<5; i++) {
        System.out.print(m++ + " ");
      }
      System.out.println();
    }
}
