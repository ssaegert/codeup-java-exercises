package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {



    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Input input = new Input();
        String userInput;

        Student Nate = new Student ("Nate");
        Nate.addGrade(94);
        Nate.addGrade(99);
        Nate.addGrade(96);
        Nate.setUserName("NateDeeOhDoubleG");

        Student Taylor = new Student ("Taylor");
        Taylor.addGrade(92);
        Taylor.addGrade(97);
        Taylor.addGrade(93);
        Taylor.setUserName("TayTay");

        Student Bob = new Student ("Bob");
        Bob.addGrade(85);
        Bob.addGrade(90);
        Bob.addGrade(91);
        Bob.setUserName("BigBob");

        Student Fred = new Student ("Fred");
        Fred.addGrade(80);
        Fred.addGrade(65);
        Fred.addGrade(89);
        Fred.setUserName("DawnOfTheFred");

        students.put("NateDeeOhDoubleG", Nate);
        students.put("TayTay", Taylor);
        students.put("BigBob", Bob);
        students.put("DawnOfTheFred", Fred);

        do {
            System.out.println("Here are the github usernames of our students:\n");

            for ( String key : students.keySet() ) {
                System.out.print( " | " + key +  " | ");
            }

            System.out.println("\n\nWhat student would you like to see more information on?");
            userInput = input.getString();
            if (students.containsKey(userInput)){
                System.out.print("Name: " + students.get(userInput).getName());
                System.out.println(" - GitHub Username: " + students.get(userInput).getUserName());
                System.out.println("Current Average: " + (int) students.get(userInput).getGradeAverage() + "\n");
                System.out.println("\nWould you like to see another student? type Y for yes or N for No");
                userInput = input.getString();
            }
        } while(!userInput.equalsIgnoreCase("n"));


    }


}
