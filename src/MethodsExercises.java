import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        //Ecercise 1


     System.out.println(add(10, 4));
     System.out.println(subtract(10, 4));
     System.out.println(multiply(10, 4));
     System.out.println(divide(10, 4));
     System.out.println(modulus(10, 4));

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number between 1 and 10.");
//        int userInput = sc.nextInt();
//        System.out.println(getInteger());

            System.out.print("Enter a number between 1 and 10: ");
            int userInput = getInteger(1, 10);
            System.out.println("Your integer is: " + userInput);



    }



    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static double modulus(double a, double b) {
        return a % b;
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


}
