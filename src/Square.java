public class Square extends Rectangle implements Resizable {

    public Square() {
        super.setWidth(1.0);
        super.setLength(1.0);
    }

    public Square(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public Square(double side, String color, boolean filled) {
        super.setWidth(side);
        super.setLength(side);
        super.setColor(color);
        super.setFilled(filled);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public String toString() {
        return "A Square with side=" + this.getWidth() + ", which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.setSide(this.getSide()*percent/100);
    }
}
