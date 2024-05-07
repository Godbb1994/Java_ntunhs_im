package HW;

import java.util.Scanner;
import java.util.Arrays;
//Score_Average
public class HW9_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type numbers:");
        String input = scanner.nextLine();


        String[] inputs = input.split(" ");

        int[] numbers = new int[inputs.length];

        for (int i = 0; i < inputs.length; i++) {
            numbers[i] = Integer.parseInt(inputs[i]);
        }

        Arrays.sort(numbers);

        System.out.println("The number array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        int maxValue = numbers[numbers.length - 1];
        int minValue = numbers[0];
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double averageValue = sum / numbers.length;


        System.out.println("MAX:" + maxValue);
        System.out.println("MIN:" + minValue);
        System.out.println("AVERAGE:" + averageValue);

        scanner.close();
    }
}