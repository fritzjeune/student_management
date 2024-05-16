import java.util.ArrayList;

public class Student {
    static int autoIncrementID = 0;
    private String name;
    private int ID;
    private ArrayList<StudentCourse> enrolledCources;

    Student( int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    private void registerToCourse (Course course) {
        StudentCourse studentCourse = new StudentCourse(course);
        this.enrolledCources.add(studentCourse);
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public ArrayList<StudentCourse> getEnrolledCources() {
        return enrolledCources;
    }
}

