public class Ex11 {
    public static void main(String[] args) {
        //do~while
        // do{반복}while(조건);
        //조건을 만족하지 않을지라도 1번의 실행을 보장
        int su = 1;
        do{
          System.out.println("실행" +  su++);
        }
        while(su<1);
    }
}
