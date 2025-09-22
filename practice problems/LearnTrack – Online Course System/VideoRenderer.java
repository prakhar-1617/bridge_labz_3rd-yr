public class VideoRenderer implements CourseContentRenderer {
    @Override
    public void render(String content) {
        System.out.println("Playing video: " + content);
    }
}
