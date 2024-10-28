public class Ex09 {
    public static int ran;

    public static void ran() {
        ran = (int) (Math.random() * 3) + 1;
    }

    public static void main(String[] args) {
        int win = 0;
        int draw = 0;
        int lose = 0;
        boolean run = true;
        java.util.Scanner sc = new java.util.Scanner(System.in);

        while (run) {
            System.out.println("----------------------------------");
            System.out.println("가위바위보 게임(ver 0.1.0)");
            System.out.print("가위(1),바위(2),보(3),종료(0) > ");
            int selNum = sc.nextInt();
            ran();

            switch (selNum) {
                case 1:
                    ran();
                    if (selNum == ran) {
                        System.out.println("당신 - " + selNum + "컴퓨터 - " + ran);
                        System.out.println("비겼습니다.");
                        draw++;
                        continue;
                    } else if (selNum == 1 && ran == 2) {
                        System.out.println("당신 - " + selNum + "컴퓨터 - " + ran);
                        System.out.println("당신은 졌습니다.");
                        lose++;
                        continue;
                    } else if (selNum == 1 && ran == 3) {
                        System.out.println("당신 - " + selNum + "컴퓨터 - " + ran);
                        System.out.println("당신이 이겼습니다.");
                        win++;
                        continue;
                    }
                case 2:
                    ran();
                    if (selNum == ran) {
                        System.out.println("당신 - " + selNum + "컴퓨터 - " + ran);
                        System.out.println("비겼습니다.");
                        draw++;
                        continue;
                    } else if (selNum == 2 && ran == 1) {
                        System.out.println("당신 - " + selNum + "컴퓨터 - " + ran);
                        System.out.println("당신이 이겼습니다.");
                        win++;
                        continue;
                    } else if (selNum == 2 && ran == 3) {
                        System.out.println("당신 - " + selNum + "컴퓨터 - " + ran);
                        System.out.println("당신은 졌습니다.");
                        lose++;
                        continue;
                    }
                case 3:
                    ran();
                    if (selNum == ran) {
                        System.out.println("당신 - " + selNum + "컴퓨터 - " + ran);
                        System.out.println("비겼습니다.");
                        draw++;
                        continue;
                    } else if (selNum == 3 && ran == 1) {
                        System.out.println("당신 - " + selNum + "컴퓨터 - " + ran);
                        System.out.println("당신은 졌습니다.");
                        lose++;
                        continue;
                    } else if (selNum == 3 && ran == 2) {
                        System.out.println("당신 - " + selNum + "컴퓨터 - " + ran);
                        System.out.println("당신이 이겼습니다.");
                        win++;
                        continue;
                    }
                    case 0:
                    System.out.println("총점" + win + "승" + draw + "무" + lose + "패");
                    win = 0;
                    draw = 0;
                    lose = 0;
                    System.out.println("이용해주셔서 감사합니다.");
                    run = false;
                    break;
            }
        }

    }
}
