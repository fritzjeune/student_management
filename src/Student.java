import java.util.ArrayList;

public class Student {
    static int autoIncrementID = 0;
    private String name;
    private int ID;
    private ArrayList<StudentCourse> enrolledCources;
    private double overallGrade;

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

    public double getOverallGrade() {
        return overallGrade;
    }

    public void setOverallGrade(double overallGrade) {
        this.overallGrade = overallGrade;
    }

    public ArrayList<StudentCourse> getEnrolledCourses() {
        return enrolledCources;
    }

    public String getStudentDetails() {
        ArrayList<StudentCourse> courses = this.getEnrolledCourses();
        String coursesText = "";
        for (StudentCourse stc: courses) {
            coursesText += "    " + stc.getCourse() + " : " + stc.getGrade() + "\n";
        }
        String details =
                        "ID : " + this.ID + "\n"
                        + "Name : " + this.name + "\n"
                        + "Courses : " + "\n"
                        + "      " + ""
                        + "OverallGrade : " + this.getOverallGrade() + "\n"
                        + "******************************************";
        return details;
    }
}

