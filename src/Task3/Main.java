package Task3;

import java.util.ArrayList;

public class Main {

    public static void main(String[]args){
        ArrayList<Person>persons = new ArrayList<>();

        Student student1 = new Student("Franck",new ArrayList<String>());
        Student student2 = new Student("Micke",new ArrayList<String>());
        Student student3 = new Student("Mikkel",new ArrayList<String>());

        Teacher teacher1 = new Teacher("André",new ArrayList<String>());
        Teacher teacher2 = new Teacher("Tess",new ArrayList<String>());
        Teacher teacher3 = new Teacher("Signe",new ArrayList<String>());

        student1.addCourse("Coding");
        student2.passedCourses.add("Java 1.0");
        student3.passedCourses.add("Java 1.0");

        teacher1.canTeach.add("Java 1.0");
        teacher2.canTeach.add("Coding");
        teacher3.canTeach.add("Coding");

        persons.add(student1);
        persons.add(student2);
        persons.add(student3);
        persons.add(teacher1);
        persons.add(teacher2);
        persons.add(teacher3);



        for (Person person : persons) {
            person.addCourse("Java 1.0");
            //System.out.println(person);
        }

    }

}
