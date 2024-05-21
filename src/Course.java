public class Course {
    private String name;
    private int courseCode;
    private int maxCapacity;

    Course (int courseCode, String name, int maxCapacity){
        this.courseCode = courseCode;
        this.name = name;
        this.maxCapacity = maxCapacity;
    }

    public String getName() {
        return name;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }
}
