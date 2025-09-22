public class pdfrenderer implements CourseContentRenderer {
    @Override
    public void render(String content) {
        System.out.println("Opening PDF: " + content);
    }
}
