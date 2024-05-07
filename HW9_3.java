package HW;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
//Student_Score
public class HW9_3 {
    public static void main(String[] args) {

        Map<String, Integer> scores = new HashMap<>();

        Scanner scanner = new Scanner(System.in, "UTF-8");
        boolean running = true;

        while (running) {
            System.out.println("學生分數管理系統");
            System.out.println("1. 新增學生成績");
            System.out.println("2. 查詢學生成績");
            System.out.println("3. 修改學生成績");
            System.out.println("4. 刪除學生成績");
            System.out.println("5. 列出所有學生成績");
            System.out.println("0. 離開系統");
            System.out.print("請選擇選項: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addScore(scores, scanner);
                    break;
                case 2:
                    queryScore(scores, scanner);
                    break;
                case 3:
                    modifyScore(scores, scanner);
                    break;
                case 4:
                    deleteScore(scores, scanner);
                    break;
                case 5:
                    listAllScores(scores);
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("輸入錯誤請重新輸入");
            }
        }
        System.out.println("離開系統");
    }

    static void addScore(Map<String, Integer> scores, Scanner scanner) {
        System.out.print("請輸入學生姓名: ");
        String name = scanner.nextLine();
        System.out.print("請輸入學生成績: ");
        int score = scanner.nextInt();
        scores.put(name, score);
        System.out.println("學生 " + name + "的成績是 " + score + " 已經被加入至清單");
    }

    static void queryScore(Map<String, Integer> scores, Scanner scanner) {
        System.out.print(": ");
        String queryName = scanner.nextLine();
        if (scores.containsKey(queryName)) {
            int queryScore = scores.get(queryName);
            System.out.println("學生 " + queryName + "的成績是: " + queryScore);
        } else {
            System.out.println("學生 " + queryName + "的成績資訊未被查詢到");
        }
    }

    static void modifyScore(Map<String, Integer> scores, Scanner scanner) {
        System.out.print("輸入學生姓名以更該成績: ");
        String modifyName = scanner.nextLine();
        if (scores.containsKey(modifyName)) {
            System.out.print("輸入成績: ");
            int newScore = scanner.nextInt();
            scores.put(modifyName, newScore);
            System.out.println("學生 " + modifyName + "的成績已被更新成 " + newScore);
        } else {
            System.out.println("學生 " + modifyName + "的成績資訊未被查詢到，無法更新");
        }
    }

    static void deleteScore(Map<String, Integer> scores, Scanner scanner) {
        System.out.print("請輸入學生的姓名已刪除成績: ");
        String deleteName = scanner.nextLine();
        if (scores.containsKey(deleteName)) {
            scores.remove(deleteName);
            System.out.println("學生 " + deleteName + "的成績已被成功刪除");
        } else {
            System.out.println("學生 " + deleteName + "的成績資訊未被查詢到，無法刪除");
        }
    }

    static void listAllScores(Map<String, Integer> scores) {
        System.out.println("所有學生的成績:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
