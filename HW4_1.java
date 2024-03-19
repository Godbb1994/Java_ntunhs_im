    import java.util.Scanner;

    public class HW4_1 {

        public static void main(String[] args) {
            String temp = "";
            Scanner sc = new Scanner(System.in);
            System.out.println("這是可以陪你聊天的機器人！你可以問我問題");
            boolean continueSwitch = true;
            while (continueSwitch) {
                System.out.println("你說");
                temp = sc.nextLine();
                if (temp.equals("0")) {
                    System.out.println("離開聊天機器人");
                    continueSwitch = false;
                    break;
                }
                if (temp != null && !temp.isEmpty()) {
                    String response = temp.replace('你', '我')
                            .replace('嗎', ' ')
                            .replace("會不會", "會")
                            .replace("能不能", "能")
                            .replace('?', '!')
                            .replace('？', '!');
                    System.out.println(response);
                }
            }
        }
    }
