import java.util.Scanner;

public class HW5_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StoreValueCard card1 = new StoreValueCard("A001", 500, 0);

        while (true) {
            System.out.println("請輸入功能編號 (1: 儲值, 2: 扣款, 3: 兌換紅利, 4: 列印明細)：");
            int function = scanner.nextInt();

            switch (function) {
                case 1:
                    System.out.println("請輸入您要存款的金額：");
                    int money = scanner.nextInt();
                    card1.addValue(money);
                    break;
                case 2:
                    System.out.println("請輸入您要扣款的金額：");
                    money = scanner.nextInt();
                    card1.charge(money);
                    break;
                case 3:
                    System.out.println("請輸入您要兌換的紅利：");
                    int bonus = scanner.nextInt();
                    card1.exchangeBonus(bonus);
                    break;
                case 4:
                    card1.printDetails();
                    break;
                default:
                    System.out.println("輸入錯誤，請重新輸入！");
            }
        }
    }
}

class StoreValueCard {

    private final String card;
    private int balance;
    private int bonus;

    public StoreValueCard(String card, int balance, int bonus) {
        this.card = card;
        this.balance = balance;
        this.bonus = bonus;
    }

    public void addValue(int money) {
        if (money > 0) {
            this.balance += money;
            if (money >= 1000) {
                this.bonus++;
            }
        } else {
            System.out.println("請確認金額不可為負");
        }
    }

    public void charge(int money) {
        if (money > 0) {
            if (money < this.balance) {
                this.balance -= money;
            } else {
                System.out.println("餘額金額不足請充值");
            }
        } else {
            System.out.println("請確認充值金額不可為負數");
        }
    }

    public void exchangeBonus(int bonus) {
        if (bonus > 0) {
            if (bonus < this.bonus) {
                this.bonus -= bonus;
            } else {
                System.out.println("紅利不足無法兌換");
            }
        } else {
            System.out.println("請確認兌換紅利的值不可為負數");
        }
    }

    public void printDetails() {
        String details = String.format("(卡號:%s, 餘額:%d, 紅利:%d)", this.card, this.balance, this.bonus);
        System.out.println(details);
    }

    public int getBalance() {
        return this.balance;
    }

    public int getBonus() {
        return this.bonus;
    }
}
