public class Ex14_1 {
    public static void main(String[] args) {
        System.out.println("1 2 3");
        System.out.println("4 5 6");
        System.out.println("7 8 9");

        System.out.println("=================2");

        for(int i = 1; i<4; i++){
          System.out.print(i + " ");
        }
        System.out.println();

        for(int i = 4; i<7; i++){
          System.out.print(i + " ");
        }
        System.out.println();

        for(int i = 7; i<10; i++){
          System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("=========================3");

        for(int d=1; d<10; d+=3){
          for(int i=d; i<d+3; i++){
            System.out.print(i + " ");
          }
        System.out.println();
      }


        System.out.println("=========================4");
        for(int i = 1; i<10; i++) {
          System.out.print(i + " ");
          if(i % 3 == 0) {
            System.out.println();
          }
        }
    }
}
