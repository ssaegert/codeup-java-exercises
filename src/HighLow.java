import java.util.Random;
import java.util.Scanner;
public class HighLow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        guesMyNumber(sc);
    }


    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("Not a number!");
            return getInteger(min, max);
        }
        int userInput = sc.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Number not in range!");
            return getInteger(min, max);
        }
    }

    public static void guesMyNumber (Scanner sc) {

        boolean keepGuessin = true;
        String userChoice;
        Random rand = new Random();
        long randomNum = rand.nextInt(100) + 1;

        do {
            System.out.println("Guess My Number Between 1 and 100!");
            int userNum = getInteger(1, 100);
            if (userNum < randomNum) {
                System.out.println("Higher!!");
            } else if (userNum > randomNum) {
                System.out.println("Lower!!");
            } else if (userNum == randomNum) {
                System.out.println("On The Nose!!!!");
                keepGuessin = false;
            }
        } while (keepGuessin);
    }

}
