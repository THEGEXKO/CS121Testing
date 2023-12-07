package Week3;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = Integer.parseInt(console.nextLine());
        String results = (num % 2 == 0)? "Even" : "Odd";
        System.out.println("The number is "+ results);
    }
}