import java.util.Scanner;
import java.util.Random;
public class guessingGame {
    public guessingGame() {
    System.out.println("Hello, Player!");
    System.out.println("What's your name?");
    System.out.println("(type in your name)");
    // 'Scanner' class is part of Java standard library; used for reading input
    Scanner input = new Scanner(System.in);
    // input saved here as name
    String name = input.nextLine();
    // create an instance of the Random object
        Random rand = new Random();
    int number = rand.nextInt(100);
    System.out.println(name + ", I've thought of a number between 1 and 100. Guess what that number is!");

        int tries = 0;
//            int guess = input.nextInt();
//            String bad_input = input.next();
            while (true) {
                int guess;
                try {
                    guess = input.nextInt();
                } catch (Exception e) {
                    System.out.println("That's not an integer, try again");
                    continue;
                }


                tries++;

                if (guess < number) {
                    System.out.println("Your guess is too low, try again.");
                } else if (guess > number) {
                    System.out.println("Your guess it too high, try again");
                } else {
                    System.out.println("Well done, " + name + "! You found my number in " + tries + " tries!");
                    break; // exit loop once guess is correct
                }
            }
        input.close(); // close scanner
        }

//    public static void main(String[] args) {
//        guessingGame game = new guessingGame();
//    }

}
