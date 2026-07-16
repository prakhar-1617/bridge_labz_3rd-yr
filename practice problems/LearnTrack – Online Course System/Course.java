import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseId;
    private String title;
    private Teacher teacher;
    private List<Student> enrolledStudents;
    private List<String> contents;

    // Constructor with teacher
    public Course(String courseId, String title, Teacher teacher) {
        this.courseId = courseId;
        this.title = title;
        this.teacher = teacher;
        this.enrolledStudents = new ArrayList<>();
        this.contents = new ArrayList<>();
    }

    // Overloaded constructor without teacher
    public Course(String courseId, String title) {
        this(courseId, title, null);
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        System.out.println(student.getName() + " enrolled in " + title);
    }

    public void addContent(String content) {
        contents.add(content);
    }

    public void showContents(CourseContentRenderer renderer) {
        for (String content : contents) {
            renderer.render(content);
        }
    }
}
