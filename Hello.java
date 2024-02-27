package hello;

import java.util.Scanner;					//宣告使用Scanner(函數/類別)
import java.lang.Math;

public class Hello {
	static int pv;
	static int fv;
	static final double interest = 0.05;
	static int interval;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		
		System.out.printf("請輸入您的本金 :");
		pv = sc.nextInt();
		System.out.printf("請輸入你的週期 :");
		interval = sc.nextInt();
		fv = (int)(pv * Math.pow((1+interest),interval));
		
		System.out.println("我的本金是 : " + pv + "經過了 " + interval + "年後我會變成 " + fv + "元。");
		
	}
}
