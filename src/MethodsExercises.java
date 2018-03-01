import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        //Ecercise 1


//     System.out.println(add(10, 4));
//     System.out.println(subtract(10, 4));
//     System.out.println(multiply(10, 4));
//     System.out.println(divide(10, 4));
//     System.out.println(modulus(10, 4));

//      Scanner sc = new Scanner(System.in);
//      System.out.println("Enter a number between 1 and 10.");
//      int userInput = sc.nextInt();
//      System.out.println(getInteger());

//      System.out.print("Enter a number between 1 and 10: ");
//      int userInput = getInteger(1, 10);
//      System.out.println("Your integer is: " + userInput);

//      Scanner sc = new Scanner(System.in);
//      userInteractionFactorial(sc);

      Scanner sc = new Scanner(System.in);
      rollTheDice(sc);



    }



//    public static double add(double a, double b) {
//        return a + b;
//    }
//
//    public static double subtract(double a, double b) {
//        return a - b;
//    }
//
//    public static double multiply(double a, double b) {
//        return a * b;
//    }
//
//    public static double divide(double a, double b) {
//        return a / b;
//    }
//
//    public static double modulus(double a, double b) {
//        return a % b;
//    }
//
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
//
//    public static long calculateFactorial(int num) {
//        int output = 1;
//        for (int i = 1; i <= num; i += 1) {
//            output *= i;
//        }
//        return output;
//    }
//
//    public static void userInteractionFactorial(Scanner sc) {
//        boolean willContinue;
//        String userChoice;
//        do {
//            System.out.println("Please enter an integer from 1 to 16");
//            int userInt = getInteger(1, 16);
//            System.out.println(calculateFactorial(userInt));
//            do {
//                System.out.println("Do you wish to continue? [y/n]: ");
//                userChoice = sc.next().trim();
//            } while (!userChoice.equalsIgnoreCase("y") & !userChoice.equalsIgnoreCase("n"));
//
//            willContinue = userChoice.equalsIgnoreCase("y");
//        } while (willContinue);
//    }


    public static void rollTheDice (Scanner sc) {
        boolean rollAgain;
        String userChoice;
        do {
            System.out.println("Please enter the number of sides for the dice (from 1 to 10");
            int userInt = getInteger(1, 10);
            Random rand = new Random();
            System.out.println("First Dice: " + (rand.nextInt(userInt) + 1));
            System.out.println("Second Dice: " + (rand.nextInt(userInt) + 1));
            do {
                System.out.println("Roll Again? [y/n]: ");
                userChoice = sc.next().trim();
            } while (!userChoice.equalsIgnoreCase("y") & !userChoice.equalsIgnoreCase("n"));

            rollAgain = userChoice.equalsIgnoreCase("y");
        } while (rollAgain);
    }


}
