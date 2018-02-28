import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

        //Exercise 1A
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

        //Exercise 1B

             //Exercise 1B.1
//        int i = 2;
//        do {
//            System.out.print(i + " ");
//            i += 2;
//        }while(i <= 100);

        //Exercise 1B.2
//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        }while(i >= -10);

        //Exercise 1B.3
//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        }while(i <= 1000000);


        //Exercise 1C
//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }

//        for (int i = 2; i <= 100; i += 2) {
//            System.out.println(i);
//        }

        //Exercise 2
//        for(int i = 1; i <= 100; i++) {
//            if(i % 3 == 0) {
//                if (i % 3 == 0 && i % 5 == 0){
//                    System.out.println("FizzBuzz");
//                } else {
//                System.out.println("Fizz");
//                }
//            } else if(i % 5 == 0) {
//                if (i % 3 == 0 && i % 5 == 0){
//                    System.out.println("FizzBuzz");
//                } else {
//                System.out.println("Buzz");
//                }
//            }
//            System.out.println(i);
//        }

//        for(int i = 1; i <= 100; i++) {
//            if(i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

        //Exercise 3
//        Scanner sc = new Scanner(System.in);
//
//        boolean toContinue = true;
//        do {
//        System.out.print("What number would you like to go up to?");
//        int userNumber = sc.nextInt();
//
//            System.out.println("\nHere is your table!");
//            System.out.println("\nnumber | squared | cubed");
//            System.out.println("------ | ------- | -----");
//
//            for (int i = 1; i <= userNumber; i += 1) {
//                String output = "";
//                output += String.format("%-7d", i);
//                output += String.format("|%-9d", i * i);
//                output += String.format("|%d", i * i * i);
//                System.out.println(output);
//                }
//                System.out.print("Would you like to continue?");
//                String userContinue = sc.next();
//                if (userContinue.equalsIgnoreCase("yes")) {
//                    toContinue = true;
//
//                } else {
//                    toContinue = false;
//                }
//            }
//            while (toContinue) ;

        //Exercise 3
        Scanner sc = new Scanner(System.in);


    }
}
