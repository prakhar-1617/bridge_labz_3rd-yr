public class Teacher extends User {
    private String expertise;

    public Teacher(String userId, String name, String expertise) {
        super(userId, name);
        this.expertise = expertise;
    }

    public String getExpertise() {
        return expertise;
    }
}
