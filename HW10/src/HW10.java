
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.io.File;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class HW10 {
    public static void main(String[] args) {
        CreateData.createDirectoryAndFile();
        Map<String, Integer> scores = new HashMap<>();

        listAllScores(scores);

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
                    listAllScores(scores);
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
        System.out.print("請輸入要查詢成績的學生姓名: ");
        String queryName = scanner.nextLine();
        if (scores.containsKey(queryName)) {
            int queryScore = scores.get(queryName);
            System.out.println("學生 " + queryName + "的成績是: " + queryScore);
        } else {
            System.out.println("學生 " + queryName + "的成績資訊未被查詢到");
        }
    }


    static void modifyScore(Map<String, Integer> scores, Scanner scanner) {
        System.out.print("輸入要修改成績的學生姓名: ");
        String modifyName = scanner.nextLine();
        if (scores.containsKey(modifyName)) {
            System.out.print("輸入新的成績: ");
            int newScore = scanner.nextInt();
            scores.put(modifyName, newScore);
            System.out.println("學生 " + modifyName + "的成績已被更新為 " + newScore);
        } else {
            System.out.println("學生 " + modifyName + "的成績資訊未被查詢到，無法更新");
        }
    }


    static void deleteScore(Map<String, Integer> scores, Scanner scanner) {
        System.out.print("請輸入要刪除成績的學生姓名: ");
        String deleteName = scanner.nextLine();
        if (scores.containsKey(deleteName)) {
            scores.remove(deleteName);
            System.out.println("學生 " + deleteName + "的成績已成功刪除");
        } else {
            System.out.println("學生 " + deleteName + "的成績資訊未被查詢到，無法刪除");
        }
    }


    static void listAllScores(Map<String, Integer> scores) {
        System.out.println("所有學生的成績:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        String filename = "dir/example.csv";

        BufferedWriter bufferedWriter = null;

        try {
            FileWriter fileWriter = new FileWriter(filename);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (Map.Entry<String, Integer> entry : scores.entrySet()) {
                bufferedWriter.write(entry.getKey() + ": " + entry.getValue());
                bufferedWriter.newLine();
            }
            System.out.println("Successfully wrote to the file: " + filename);

        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());

        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                System.err.println("An error occurred while closing the file: " + e.getMessage());
            }
        }
    }
}

class CreateData {
    static void createDirectoryAndFile() {
        File dir = new File("dir");
        if (!dir.exists()) {
            boolean created = dir.mkdir();
            if (created) {
                System.out.println("目錄已創建: " + dir.getAbsolutePath());
            } else {
                System.out.println("無法創建目錄: " + dir.getAbsolutePath());
                return;
            }
        }

        File file = new File(dir, "example.csv");
        try {
            boolean created = file.createNewFile();
            if (created) {
                System.out.println("文件已創建: " + file.getAbsolutePath());
            } else {
                System.out.println("文件已存在: " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("創建文件時出現錯誤: " + e.getMessage());
        }
    }
}