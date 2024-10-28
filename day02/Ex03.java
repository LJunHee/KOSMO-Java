public class Ex03 {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("a = " + a);
        a = 6;
        System.out.println("a = " + a);
        // a = a + 1;
        a = a * 5;
        System.out.println("a = " + a);
        // a += 1; // a = a + (1)
        a *= 2+3; // a = a * (2+3)
        System.out.println("a = " + a);
        a++;
        System.out.println("a = " + a);

        byte b = 1;
        b += 1;
        // b = b + 1;
        System.out.println("byte b = " + b);
        
        byte c = 126;
        System.out.println("byte c = " + c);
        c++;
        System.out.println("byte c = " + c);
        c++;
        System.out.println("byte c = " + c);
        c++;

    }
}