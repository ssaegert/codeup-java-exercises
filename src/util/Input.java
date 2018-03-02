package util;

import java.util.Scanner;

public class Input {


    private Scanner scan;

    public Input() {
        this.scan = new Scanner(System.in).useDelimiter("\n");
    }

    public String getString() {
    return this.scan.next();
    }

    boolean yesNo() {
        return this.scan.nextBoolean();
    }

    public int getInt(int min, int max) {
        if (!scan.hasNextInt()) {
            System.out.println("Not a number!");
            return getInt(min, max);
        }
        int userInput = scan.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Number not in range!");
            return getInt(min, max);
        }
    }

    public int getInt() {
        int userInput = scan.nextInt();
        if (!scan.hasNextInt()) {
            System.out.println("Not a number!");
            return getInt();
        } else {
            return userInput;
        }
    }

    public double getDouble(double min, double max) {
        if (!scan.hasNextDouble()) {
            System.out.println("Not a number!");
            return getDouble(min, max);
        }
        double userInput = scan.nextDouble();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Number not in range!");
            return getDouble(min, max);
        }
    }

    public double getDouble() {
        double userInput = scan.nextDouble();
        if (!scan.hasNextInt()) {
            System.out.println("Not a number!");
            return getDouble();
        } else {
            return userInput;
        }
    }

}