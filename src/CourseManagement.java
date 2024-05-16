import java.util.ArrayList;

public class CourseManagement {
    public static ArrayList<Student> studentList = new ArrayList<>();
    public static ArrayList<Course> courseList = new ArrayList<>();

    public static String addCourse (int courseCode, String name, int maxCapacity) {
        Course course = new Course(courseCode, name, maxCapacity);
        courseList.add(course);
        return "Course Added!!";
    }

    public static String registerStudent (int ID, String name) {
        Student student = new Student(ID, name);
        studentList.add(student);
        return "Course Added!!";
    }

    public static String assignGrade (Student student, Course course, double grade) {
        for (StudentCourse sc : student.getEnrolledCourses()) {
            if (sc.getCourse() == course) {
                sc.setGrade(grade);
            }
        }
        return "Grade Assigned!";
    }

    public static double calculateOverallGrade (Student student) {
        double totalPoints = 0.0;
        ArrayList<StudentCourse> courseList = student.getEnrolledCourses();
        for (int i = 0; i < courseList.size(); i++) {
            System.out.println(courseList.get(i));
            totalPoints += courseList.get(i).getGrade();
        }
        return totalPoints;
    }

}
