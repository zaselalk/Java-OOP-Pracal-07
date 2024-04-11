public class TestCircle {
    public static void main(String[] args) {
        Circle newCircle = new Circle();
        System.out.println(newCircle.getArea());
        System.out.println(newCircle.getPerimeter());

        ResizableCircle resizableCircle = new ResizableCircle();
        System.out.println(resizableCircle.getPerimeter());
        System.out.println(resizableCircle.getArea());

        resizableCircle.resize(100);
        System.out.println(resizableCircle.getPerimeter());
        System.out.println(resizableCircle.getArea());

    }
}
