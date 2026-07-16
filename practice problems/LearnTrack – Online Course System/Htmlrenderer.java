public class Htmlrenderer implements CourseContentRenderer {
    @Override
    public void render(String content) {
        System.out.println("Displaying HTML page: " + content);
    }
}
