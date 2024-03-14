package Task3;

import java.util.ArrayList;

public class Teacher extends Person {
    ArrayList<String> canTeach = new ArrayList<>();
    ArrayList<String> currentCourses = new ArrayList<>();

    public Teacher(String name, ArrayList<String> canTeach) {
        super(name);

    }


    @Override
    public boolean addCourse(String course) {
        if (canTeach.contains(course)) {
            System.out.println(getName()+": "+course+" added to list of current courses");
            currentCourses.add(course);
        }
        System.out.println(getName()+": Cannot teach "+course+", course not added.");
        return false;

    }
}
