
public class HW5_1 {
    public static void main(String[] args) {
        class StoreValueCard{
            String card;
            int balance;
            int bounus;
        }
        StoreValueCard car1 = new StoreValueCard();
        StoreValueCard car2 = new StoreValueCard();
        StoreValueCard car3 = new StoreValueCard();
        car1.card="A001";car1.balance=500;car1.bounus=0;
        car2.card="A002";car2.balance=300;car2.bounus=0;
        car3.card="A003";car3.balance=1000;car3.bounus=1;
        System.out.println("Card ID: " + car1.card + ", Balance: " + car1.balance + ", Bonus: " + car1.bounus);
        System.out.println("Card ID: " + car2.card + ", Balance: " + car2.balance + ", Bonus: " + car2.bounus);
        System.out.println("Card ID: " + car3.card + ", Balance: " + car3.balance + ", Bonus: " + car3.bounus);
    }


}
