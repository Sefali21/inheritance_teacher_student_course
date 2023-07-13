package beziehungLehrerStudent;

public class Lesson extends Course{
    private String lessonName;
    private String  lessonId;

    public Lesson(String courseName, String courseId, String courseBranche, String courseDauert, String lessonName, String lessonId) {
        super(courseName, courseId, courseBranche, courseDauert);
        this.lessonName = lessonName;
        this.lessonId = lessonId;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String  getLessonId() {
        return lessonId;
    }

    public void setLessonId(String lessonId) {
        this.lessonId = lessonId;
    }

    @Override
    public String toString() {
        return "Lesson " +super.toString() +
                "lessonName='" + lessonName + '\'' +
                ", lessonId=" + lessonId +
                '}';
    }
}

