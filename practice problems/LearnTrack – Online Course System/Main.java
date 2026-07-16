public class Main {
    public static void main(String[] args) {
        // Create teacher and students
        Teacher t1 = new Teacher("T101", "Dr. Smith", "Computer Science");
        Student s1 = new Student("S201", "Alice", "A");
        Student s2 = new Student("S202", "Bob", "B");

        // Create a course
        Course course1 = new Course("C301", "Java Programming", t1);

        // Enroll students
        course1.enrollStudent(s1);
        course1.enrollStudent(s2);

        // Add course contents
        course1.addContent("Intro to Java.mp4");
        course1.addContent("Java Basics.pdf");
        course1.addContent("OOP Concepts.html");

        // Render content in different formats
        System.out.println("\n--- Video Format ---");
        course1.showContents(new VideoRenderer());

        System.out.println("\n--- PDF Format ---");
        course1.showContents(new pdfrenderer());

        System.out.println("\n--- HTML Format ---");
        course1.showContents(new Htmlrenderer());
    }
}
