package day05;
/*
 * 배열
 * 자료형[]
 *
 * 자료형[] 변수명 = new 자료형[갯수];
 *
 * call
 * 변수명[인덱스]
 *
 * index
 * 0부터 시작 ~ 갯수 -1까지 존재
 */

public class Ex01 {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 1;
        a[1] = 3;
        a[2] = 5;
        a[3] = 7;
        a[4] = 9;

        System.out.println("배열 길이는 " + a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        // for(int i=0; i<5; i++){
        // System.out.println(a[i]);
        // }
        // }
    }
}
