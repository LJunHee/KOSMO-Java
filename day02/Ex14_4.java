public class Ex14_4 {
    public static void main(String[] args) {
      System.out.println("1");
      System.out.println("2 2");
      System.out.println("3 3 3");

      System.out.println("==================2");

      for(int i = 1; i<4; i++) {
        for(int j = i; j<i*2; j++) {
          System.out.print(i + " ");
        }
        System.out.println();
      }

      System.out.println("========================3");
      for(int i = 1; i<4; i++) {
        for(int j = 0; j<i; j++) {
          System.out.print(i + " ");
        }
        System.out.println();
      }
    }
}
