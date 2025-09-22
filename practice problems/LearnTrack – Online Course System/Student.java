public class Student extends User {
    private String grade;

    public Student(String userId, String name, String grade) {
        super(userId, name);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }
}
