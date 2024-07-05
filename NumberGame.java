import java.util.*;
public class NumberGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean play = true;
        int totalscore=0,score;
        int played=0;
        while (play) {
            System.out.println("Welcome to the Number Game!");
            int guess, i, round = 10;
            boolean attempt = false;
            System.out.println("I have generated a number between 1 and 100. Try to guess it!");
            int random = (int) (Math.random() * 100) + 1;
            System.out.println(random);
            for (i = 1; i <= round; i++) {
                System.out.print("Enter your guess: ");
                guess = in.nextInt();
                if (guess > random) {
                    System.out.println("TOO HIGH! GUESS AGAIN");
                } else if (guess < random) {
                    System.out.println("TOO LOW! GUESS AGAIN");
                } else {
                    System.out.println("Congratulations! You've guessed the number.");
                    attempt=true;
                    break;
                }
            }
            if (!attempt) {
                System.out.println("Sorry! You've used all your attempts. The number was " + random);
            }
            score=10-i;
            System.out.println("Your current score: " +score);
            totalscore=totalscore+score;
            played++;
            System.out.print("Do you want to play again? (yes/no): ");
            String response = in.next();
            response = response.toLowerCase();
            play = response.equals("yes");

        }
        System.out.println("Thank you for playing! Your total score after " + played + " rounds is: " + totalscore);

    }
}
