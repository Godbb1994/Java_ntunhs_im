    import java.util.Scanner;

    public class HW3_1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            boolean isAlwaysShow = false;

            while (!isAlwaysShow) {
                System.out.print("請輸入你希望的陣列大小(最多為100個）：");
                int num = sc.nextInt();
                int[] arr = new int[num];
                if (num <= 100 && num > 0) {
                    for (int i = 0; i < num; i++) {
                        System.out.printf("請輸入第 %d 個元素：", i + 1);
                        arr[i] = sc.nextInt();
                    }
                    int idx = num - 1;
                    while (idx >= 0) {
                        System.out.printf("arr[%d]: %d\n", idx, arr[idx]);
                        idx--;
                    }
                }
                else if (num < 0){
                    System.out.print("請輸入正整數");
                }
                else {
                    System.out.print("你輸入的數字超過100或小於0,請重新輸入");
                }
            }
        }
    }
