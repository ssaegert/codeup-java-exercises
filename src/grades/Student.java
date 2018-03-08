package grades;

import java.util.ArrayList;

public class Student {


    private String name;
    private static ArrayList<Integer> grades;
    private String userName;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }



    public double getGradeAverage(){
        double sum = 0;
        for(double g : this.grades)
            sum += g;
        return sum / grades.size();
    }
//
//    public String allGrades(){
//        String gradesList = "";
//        for(String g : toString(this.grades))
//            sum += g;
//        return sum / grades.size();
//    }


    public static void main(String[] args) {
//        grades.add(20);
//        grades.add(10);
//        System.out.println(grades);
//        System.out.println(getGradeAverage());

    }
}
