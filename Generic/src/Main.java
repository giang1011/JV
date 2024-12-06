import Entity.Student;
import Entity.Teacher;

import General.Manager;

public class Main {
    public static void main(String[] args) {

        Manager<Student> studentManager = new Manager<>();
        studentManager.addItem(new Student(1, "Alice", "Computer Science"));
        studentManager.addItem(new Student(2, "Bob", "Mathematics"));

        System.out.println("List of Students:");
        studentManager.displayItems();


        Manager<Teacher> teacherManager = new Manager<>();
        teacherManager.addItem(new Teacher(1, "Dr. Smith", "Physics"));
        teacherManager.addItem(new Teacher(2, "Prof. Johnson", "History"));

        System.out.println("\nList of Teachers:");
        teacherManager.displayItems();
    }
}
