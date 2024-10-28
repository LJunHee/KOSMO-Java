public class Ex14_3 {
    public static void main(String[] args) {
        for(char i = 65; i<74; i++) {
          System.out.print(i + " ");
          if(i == 67 || i == 70 || i == 73) {
            System.out.println();
          }
        }

        System.out.println("=================2");

        int c1 = 'A';
        int c2 = 'I';
        int cnt = 0;

        for(int i=c1; i<c2+1; i++) {
          cnt++;
          System.out.print((char)i + " ");
          if(cnt==3) {
            System.out.println();
            cnt = 0;
          }
        }

    }
}
