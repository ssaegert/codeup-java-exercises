import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        System.out.print("no break,");

        System.out.println(" continued line");

        int myFavoriteNumber = 42;
        System.out.println(myFavoriteNumber);

        String myString = "Scott Saegert";
        System.out.println(myString);

        double myNumber = 3.14;
        System.out.println(myNumber);

        int x = 5;
        System.out.println(++x);
        System.out.println(x);

        int y = 4;
        System.out.println(y += 5);

        int a = 3;
        int b = 4;
        System.out.println(b *= a);

        int c = 10;
        int d = 2;
        System.out.println(c /= d);
        System.out.println(d -= c);


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
