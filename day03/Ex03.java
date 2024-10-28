public class Ex03 {
    public static void main(String[] args) {
        int a = 1111;
        System.out.println("main before a = " + a);
        func01();
        System.out.println("main after a = " + a);
    }

    public static void func01(){
        int a = 3333;
        System.out.println("func01 a = " + a);
    }

}
