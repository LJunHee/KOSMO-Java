public class Ex09 {
    public static void main(String[] args) {
        //①for(②초기화; ③조건; ④증감) {⑤반복할 내용}⑥
        // 1 → 2 → 3(true) → 5 → 4 → 3(true) → 5 → 4 ...
        // 5 → 4 → 3(false) → 6
        // int su = 1;
        for(int su = 1; su<10; su++) {
            System.out.println("2 x " + su + " = " + 2*su);
        }

        // System.out.println("2 x " + su + " = " + 2*su);
        // su++;
        // System.out.println("2 x " + su + " = " + 2*su);
        // su++;
        // System.out.println("2 x " + su + " = " + 2*su);
        // su++;
        // System.out.println("2 x 1 = " + 2*1);
        // System.out.println("2 x 2 = " + 2*2);
        // System.out.println("2 x 3 = " + 2*3);
        // System.out.println("2 x 4 = " + 2*4);
        // System.out.println("2 x 5 = " + 2*5);
        // System.out.println("2 x 6 = " + 2*6);
        // System.out.println("2 x 7 = " + 2*7);
        // System.out.println("2 x 8 = " + 2*8);
        // System.out.println("2 x 9 = " + 2*9);
    }

}
