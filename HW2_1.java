package hello1;
import java.util.Scanner;

public class HW2_2 {

    static String fever;
    static String cough;
    static String lazy;
    static String highbool;
    static String dry;
    static String sweats;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("歡迎使用醫療診斷系統, 請依序回答問題");
        System.out.println("============================");
        
        while (true) {
            System.out.println("請問您最近是否發燒(y/n)=>");
            fever = sc.next();

            if (fever.equalsIgnoreCase("y") || fever.equalsIgnoreCase("n")) {
                break;
            } else {
                System.out.println("輸入錯誤,請重新輸入");
            }
        }
        if (fever.equalsIgnoreCase("y")) {
            while (true) {
                System.out.println("請問您最近是否咳嗽(y/n)=>");
                cough = sc.next();

                if (cough.equalsIgnoreCase("y") || cough.equalsIgnoreCase("n")) {
                    break;
                } else {
                    System.out.println("輸入錯誤,請重新輸入");
                }
            }
            if (cough.equalsIgnoreCase("y")) {
                while (true) {
                    System.out.println("請問您最近是否感覺到疲憊(y/n)=>");
                    lazy = sc.next();

                    if (lazy.equalsIgnoreCase("y") || lazy.equalsIgnoreCase("n")) {
                        break;
                    } else {
                        System.out.println("輸入錯誤,請重新輸入");
                    }
                }
                if (lazy.equalsIgnoreCase("y")) {
                    System.out.println("您感冒了");
                } else {
                    System.out.println("其他系統");
                }
            } else {
                while (true) {
                    System.out.println("請問您是否血壓升高(y/n)=>");
                    highbool = sc.next();

                    if (highbool.equalsIgnoreCase("y") || highbool.equalsIgnoreCase("n")) {
                        break;
                    } else {
                        System.out.println("輸入錯誤,請重新輸入");
                    }
                }
                if (highbool.equalsIgnoreCase("y")) {
                    while (true) {
                        System.out.println("請問您是否口乾(y/n)=>");
                        dry = sc.next();

                        if (dry.equalsIgnoreCase("y") || dry.equalsIgnoreCase("n")) {
                            break;
                        } else {
                            System.out.println("輸入錯誤,請重新輸入");
                        }
                    }
                    if (dry.equalsIgnoreCase("y")) {
                        System.out.println("先生/小姐您可能得肝病!");
                    } else {
                        System.out.println("其他系統");
                    }
                } else {
                    while (true) {
                        System.out.println("請問您最近是否盜汗(y/n)=>");
                        sweats = sc.next();

                        if (sweats.equalsIgnoreCase("y") || sweats.equalsIgnoreCase("n")) {
                            break;
                        } else {
                            System.out.println("輸入錯誤,請重新輸入");
                        }
                    }
                    
                    if (sweats.equalsIgnoreCase("y")) {
                        System.out.println("先生/小姐您可能得肝病!");
                    } else {
                        System.out.println("其他系統");
                    }
                }
            }
        } else {
            System.out.println("恭喜你, 身體健康");
        }
    }
}
