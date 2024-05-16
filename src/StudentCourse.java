public class StudentCourse {
    private Course course;
    private double grade;

    StudentCourse (Course course, double grade) {
        this.course = course;
        this.grade = grade;
    }

    StudentCourse (Course course) {
        this.course = course;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public Course getCourse() {
        return course;
    }
}
