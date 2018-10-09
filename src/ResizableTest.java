public class ResizableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Square(4);
        shapes[2] = new Rectangle(5,8,"red", true);
        for (Shape shape : shapes) {
            if (shape instanceof Resizable) {
                ((Resizable) shape).resize(50);
                System.out.println(shape);
            }
        }
    }
}
