//反向輸出  輸入30數字 , 倒敘印出

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int idx = 0;
        int num = 30;
        int[] arr = new int[30];

        for (int i = 0; i < num; i ++){
            arr[i] = sc.nextInt();
        }
        idx = num - 1;
        while(idx>=0 && idx < num){
            System.out.printf("arr[%d]:%d\n", idx ,arr[idx]);
            idx --;
        }

    }

}

