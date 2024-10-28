public class Ex09Copy {
    public static void main(String[] args) {
        int ran = 0;
        int win = 0;
        int draw = 0;
        int lose = 0;
        int selNum =0;
        boolean run = true;
        java.util.Scanner sc = new java.util.Scanner(System.in);

        String result = "";

        while (run) {
            result = "";
            System.out.println("----------------------------------");
            System.out.println("가위바위보 게임(ver 0.1.0)");
            System.out.print("가위(1),바위(2),보(3),종료(0) > ");
            selNum = sc.nextInt();
            ran = (int) (Math.random() * 3);

            if (ran == 0)
                result += "컴퓨터 - 가위\t";
            if (ran == 1)
                result += "컴퓨터 - 바위\t";
            if (ran == 2)
                result += "컴퓨터 - 보\t";

            selNum -= 1;
            if (selNum == 0)
                result += "당신 - 가위\n";
            if (selNum == 1)
                result += "당신 - 바위\n";
            if (selNum == 2)
                result += "당신 - 보\n";

            if (selNum == ran + 1) {
                draw++;
                result +="비겼음";
            } else if ((selNum == 0 && ran == 2) || (selNum == 1 && ran == 0) || (selNum == 2 && ran == 1)) {
                win++;
                result+="이겼음";
            } else if ((selNum == 0 && ran == 1) || (selNum == 1 && ran == 2) || (selNum == 2 && ran == 0)) {
                lose++;
                result+="졌음";
            } else if (selNum == 0) {
                break;
            }
            System.out.println(result);
        }
        System.out.println("총점" + win + "승" + draw + "무" + lose + "패");
        System.out.println("이용해주셔서 감사합니다.");

    }
}
