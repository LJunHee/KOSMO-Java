package day04;

public class Ex09 {
    public Ex09(){
        super();
        System.out.println("생성자");
    }
    public Ex09(int a){
        this();
        System.out.println("a = " + a);
    }
    public static void main(String[] args) {
        new Ex09(1111);
    }

}
