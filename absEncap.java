import java.util.*;

abstract class Student {
    protected String name;
    protected int id;


    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract void study();

    public void showDetails() {
        System.out.println("Student ID: " + id + ", Name: " + name);
    }
}

class CollegeStudent extends Student {
    private String course;

    public CollegeStudent(String name, int id, String course) {
        super(name, id);
        this.course = course;
    }

    public void study() {
        System.out.println(name + " is studying " + course);
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        if (!course.isEmpty()) {
            this.course = course;
        } else {
            System.out.println("Course name cannot be empty!");
        }
    }
}

public class absEncap {
    public static void main(String[] args) {
        
        CollegeStudent student = new CollegeStudent("Hari", 101, "Computer Science");

        student.showDetails();
        student.study();
        System.out.println("Enrolled Course: " + student.getCourse());

        student.setCourse("Data Science");
        System.out.println("Updated Course: " + student.getCourse());
    }
}