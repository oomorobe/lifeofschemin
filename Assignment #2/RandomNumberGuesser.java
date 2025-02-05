import java.util.Scanner;
/**
 * Driver Class
 */
public class RandomNumberGuesser {
    public static Scanner scan;
    public static int randNum;
    public static int nextGuess, highGuess, lowGuess;
    public static RNG rang;
    public static void main(String[] args) {
        rang = new RNG();
        String play_or_not = "yes";
        while ( play_or_not.equals("yes")) {
            initialiseGame();
            playGame();
            System.out.println("Try again? (yes or no)");
            play_or_not = scan.next();
            System.out.println("");
        }
        System.out.println("Thanks for playing...");
    }
    /**
     * initialise the game
     */
    @SuppressWarnings("static-access")
	public static void initialiseGame() {
        lowGuess = 0;
        highGuess = 100;
        randNum = rang.rand();
        rang.resetCount();
    }
    
    /**
     * play the game
     */
    @SuppressWarnings("static-access")
	public static void playGame() {
        scan = new Scanner(System.in);
        System.out.println("========Welcome to the Number Guessing Game=======");
        System.out.println("Enter your first guess");
        nextGuess = scan.nextInt();

        while(nextGuess != randNum) {
            if (!rang.inputValidation(nextGuess, lowGuess, highGuess)) {
                nextGuess = scan.nextInt();
                continue;
            }

            System.out.println("Number of guesses is "+rang.getCount());
            if (nextGuess>randNum) {
                highGuess = nextGuess;
                System.out.println("Your guess is too high");
                
            } else {
                lowGuess = nextGuess;
                System.out.println("Your guess is too low");
            }
            System.out.println("Enter your next guess between "+ lowGuess + " and " + highGuess);
            nextGuess = scan.nextInt();
        }
        System.out.println("Number of guesses is "+(rang.getCount()+1));
        System.out.println("Congratulations, you guessed correctly");
    }
}