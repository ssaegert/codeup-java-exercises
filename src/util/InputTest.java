package util;

/**
 * Created by moon on 11/27/17.
 */
public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("Enter yes");
        String userString = input.getString();
        System.out.println(userString);

//        System.out.println("Enter yes");
//        if(input.yesNo()) {
//            System.out.println("Thank You'");
//        } else {
//            System.out.println("I said enter yes.");
//        }

//        int range = input.getInt(1, 10);
//        System.out.println(range);

        System.out.println("Enter Int");
        int userInt = input.getInt();
        System.out.println(userInt);

        System.out.println("Enter Double");
        double userDouble2 = input.getDouble(1.0, 20.0);
        System.out.println(userDouble2);

        System.out.println("Enter Double");
        double userDouble = input.getDouble();
        System.out.println(userDouble);
    }
}