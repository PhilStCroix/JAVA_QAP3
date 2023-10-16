public class Square extends Rectangle {
    public Square(double side) {
        super(side, side); // Call the superclass constructor to set width and length to the same value (side)
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width); // Call the superclass setter to set the width
        super.setLength(width); // Also set the length to maintain square geometry
    }

    @Override
    public void setLength(double length) {
        super.setLength(length); // Call the superclass setter to set the length
        super.setWidth(length);   // Also set the width to maintain square geometry
    }

    @Override
    public String toString() {
        return "A Square with side=" + getWidth() + ", which is a subclass of " + super.toString();
    }

    // No need to override getArea and getPerimeter because they work correctly based on the superclass methods
}