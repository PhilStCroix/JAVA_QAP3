public class TestShape {
    public static void main(String[] args) {
        // Create instances of the Shape class
        Shape shape1 = new Shape();
        System.out.println("Shape 1: " + shape1);
        
        Shape shape2 = new Shape("blue", false);
        System.out.println("Shape 2: " + shape2);

        // Test setter methods
        shape1.setColor("red");
        shape1.setFilled(true);

        System.out.println("Updated Shape 1: " + shape1);

        // Test getter methods
        String colorOfShape2 = shape2.getColor();
        boolean isFilledShape2 = shape2.isFilled();

        System.out.println("Color of Shape 2: " + colorOfShape2);
        System.out.println("Is Shape 2 filled? " + isFilledShape2);
    }
}
