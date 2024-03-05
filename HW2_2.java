

// 終極密碼
package hello1;
import java.util.Scanner;
import java.util.Random;

public class HW2_2 {
	public static void main(String[] args) {
		Random rand = new Random();
		int ans = rand.nextInt(100);    //隨機產生1~100的數字
		int guess = 0;
		Scanner sc = new Scanner (System.in);
		int count = 0;
		int min = 0;
		int max = 100;
		System.out.println("請輸入一個0~100數字:");
		while(true) {
			count++;
			guess = sc.nextInt();
			
			if(guess < min || guess > max) {
				System.out.print("你猜的數字不在範圍內，請輸入" + min + "~" + max + "的數字:");
			}else if(guess > ans) {
				max = guess;
				System.out.print("你猜的數字太大了,請輸入" + min + "~" + max + "的數字:");
			}else if(guess < ans) {
				min = guess;
				System.out.print("你猜的數字太小了, 請輸入" + min + "~" + max+ "的數字:");
			}
			else {
				System.out.println("恭喜你猜對了，你總共猜了" + count + "次");
				break;
			}
			if(count == 10) {
				System.out.println("你猜的次數超過了10次，遊戲結束");
				break;
			}
		}
	}
}

		