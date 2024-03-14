package Task3;

import java.util.ArrayList;

public class Student extends Person {
    ArrayList<String> passedCourses = new ArrayList<>();
    ArrayList<String> currentCourses = new ArrayList<>();

    public Student(String name, ArrayList<String> passedCourses) {
        super(name);

    }


    @Override
    public boolean addCourse(String course) {
        if (passedCourses.contains(course)) {
            System.out.println(getName()+": "+course+" is passed, cannot add course.");
            return false;
        } else {
            currentCourses.add(course);
            System.out.println(getName()+": "+course+" added to list of current courses.");
            return true;
        }
    }
}
