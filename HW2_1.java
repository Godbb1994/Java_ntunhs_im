package hello1;
import java.util.Scanner;


public class HW2_1 {
	static String fever;
	static String cough;
	static String lazy;
	static String highbool;
	static String dry;
	static String sweats;

	public static void main(String[] args) {
		
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("歡迎使用醫療診斷系統, 請依序回答問題");
		System.out.println("============================");
		System.out.println("請問您最近是否發燒(y/n)=>");

		fever = sc.next();
		if(fever.toLowerCase().equals("y")) {
			System.out.println("請問您最近是否咳嗽(y/n)=>");
			cough = sc.next();
			if(cough.toLowerCase().equals("y")){
				System.out.println("請問您最近是否感覺到疲憊(y/n)=>");
				lazy = sc.next();
				if(lazy.toLowerCase().equals("y")) {
					System.out.println("您感冒了");}
					else  {
						System.out.println("其他系統");	
					}
				}
			else  {
				System.out.println("請問您是否血壓升高(y/n)=>");
				highbool = sc.next();
				if(highbool.toLowerCase().equals("y")) {
					System.out.println("請問您是否口乾(y/n)=>");
					dry = sc.next();
					if(dry.toLowerCase().equals("y")) {
						System.out.println("先生/小姐您可能得肝病!");
					}
					else {
						System.out.println("其他系統");
					}
				}
				else {
					System.out.println("請問您最近是否盜汗(y/n)=>");
					sweats = sc.next();
					if(sweats.toLowerCase().equals("y")) {
						System.out.println("先生/小姐您可能得肝病");
					}
					else {
						System.out.println("其他系統");
					}
				}
			}
			}
		else {
			System.out.println("恭喜你, 身體健康");
			
		
	}
}
	}
}
