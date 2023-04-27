import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    public long id;
    public String name;
    public ArrayList<Integer> grades;

    public Student(String name, long id, ArrayList<Integer> grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

    public Student(String name, long id) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }
    public void addGrade(int grade){
        Integer gradeEntered = grade;
        this.grades.add(gradeEntered);
    }
    public double getGradeAverage(){
        int total = 0;
        for(int grade : grades){
            total+=grade;
        }
        return (double) total / grades.size();
    }

}
