public class Ex14_2 {
    public static void main(String[] args) {
      int cnt = 0;
      for(int i=1; i<6; i++) {
        System.out.print(i + " ");
        cnt++;
        if(cnt == 3) {
          i-=2;
          cnt=0;
          System.out.println();
        }
        if(i==4) {
          System.out.print(i+1 + " ");
          break;
      }
    }

      System.out.println();
      System.out.println("====================2");

        for(int i=1; i<4; i++) {
          System.out.print(i + " ");
        }
        System.out.println();

        for(int i=2; i<5; i++) {
          System.out.print(i + " ");
        }
        System.out.println();

        for(int i=3; i<6; i++) {
          System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("=======================3");

        for(int i=0; i<3; i++) {
          System.out.print(1 + i + " ");
          System.out.print(2 + i + " ");
          System.out.print(3 + i + " ");
          System.out.println();
        }

        System.out.println("=======================4");

        for(int i=0; i<3; i++) {
          for(int j=1; j<4; j++) {
            System.out.print(j + i + " ");
          }
          System.out.println();
        }
    }
}
