package HW;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
//Phonee_Number
public class HW9_2 {
    public static void main(String[] args) {
        int sum = 0;
        String line;
        boolean isLoop=true;
        Set<String> set =new HashSet<>();
        while(isLoop) {
        line = input("Type your phone number, if you've done press 0:");
        if (line.equals("0")) isLoop=false;
        else {
        set.add(line);
        }
        }
        System.out.println("Your phone number quantitiy is:"+set.size());
        System.out.println(set);
        }
        static String input(String prompt){
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        return line;
        }
    }