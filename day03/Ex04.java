class Ex04 {
    public static void main(String[] args) {
        Ex04 me; //클래스타입 변수명
        me = new Ex04(); // 객체생성
        me.func01();

    }

    public void func01() {
        System.out.println("non-static method func01");
    }
}
