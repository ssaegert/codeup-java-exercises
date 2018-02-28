import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int userNumber = sc.nextInt();
//        System.out.println("You entered: -- " + userNumber + " --");
//--------------------------------
//        System.out.println("Type Three Words");
//        String wordOne, wordTwo, wordThree;
//
//        wordOne = sc.nextLine();
//        wordTwo = sc.nextLine();
//        wordThree = sc.nextLine();
//
//        System.out.println(wordOne);
//        System.out.println(wordTwo);
//        System.out.println(wordThree);
//--------------------------------
//        System.out.println("Type a sentence");
//        String sentence;
//        sentence = sc.nextLine();
//        System.out.println(sentence);
//--------------------------------
        System.out.println("Type the classroom Width and Length");
        String classWidth, classLength;
        classWidth = sc.nextLine();
        classLength = sc.nextLine();
        double width = Double.parseDouble(classWidth);
        double length = Double.parseDouble(classLength);
        double area = width * length;
        double perimeter = 2 * width + 2 * length;

        System.out.println("The classroom area is: " + area);
        System.out.println("The classroom perimeter is: " + perimeter);

    }
}
