package beziehungLehrerStudent;

public class Course {
    private String courseName;
    private String  courseId;
    private String courseBranche;
    private String courseDauert;

    public Course(String courseName, String courseId, String courseBranche, String courseDauert) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.courseBranche = courseBranche;
        this.courseDauert = courseDauert;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseBranche() {
        return courseBranche;
    }

    public void setCourseBranche(String courseBranche) {
        this.courseBranche = courseBranche;
    }

    public String getCourseDauert() {
        return courseDauert;
    }

    public void setCourseDauert(String courseDauert) {
        this.courseDauert = courseDauert;
    }

    @Override
    public String toString() {
        return "Course{ " +
                "courseName='" + courseName + '\'' +
                ", courseId=" + courseId +
                ", courseBranche='" + courseBranche + '\'' +
                ", courseDauert='" + courseDauert + '\'' +
                '}';
    }
}
