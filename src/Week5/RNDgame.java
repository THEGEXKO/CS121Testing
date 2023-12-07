package Week5;


import java.util.Random;
import java.util.Scanner;

public class RNDgame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int score = 0;
        String[] colors = {

                "Red", "Green", "Blue", "Orange", "Yellow"
        };
        //for (int j = 1; j <= 10; j++) {
            for (int i = 0; i < 10; i++) {
                Random random = new Random();
                int rnd = random.nextInt(colors.length);
                String rand = colors[rnd];
                System.out.println("Enter a Color.");
                String word = console.nextLine();
                System.out.println("The computer chose: "+rand);
                if (word.equalsIgnoreCase(rand)) {
                    score = score + 1;
                }

            }System.out.println("Your score was " +score+" out of 10" );
        }

    }
