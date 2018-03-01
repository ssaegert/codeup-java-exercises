import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        String sentence;
        Scanner sc = new Scanner(System.in);
        sentence = sc.nextLine();

        if (sentence.endsWith("?")) {
            System.out.println("Sure.");
        } else if (sentence.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (sentence.endsWith("")) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }


    }
}
