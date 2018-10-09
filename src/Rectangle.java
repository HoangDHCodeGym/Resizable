public class Rectangle extends Shape implements Resizable {
    private double width;
    private double length;

    public Rectangle() {
        super();
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(String color, boolean filled) {
        super(color, filled);
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return (this.width + this.length) * 2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width=" + this.width + "and length="+ this.length + ", which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.setWidth(width*percent/100);
        this.setLength(length*percent/100);
    }
}
