public class TestShapes {
    public static void main(String[] args) {
        Shape S = new Shape("Red", true);
        System.out.println(S.toString());

        Circle C = new Circle(5.0);
        System.out.println(C.toString());
        System.out.println("Circle area: " + C.getArea());
        System.out.println("Circle perimeter: " + C.getPerimeter());

        Circle C1 = new Circle("blue", true, 5.0);
        System.out.println(C1.toString());
        System.out.println("Circle 1 area: " + C1.getArea());
        System.out.println("Circle 1 perimeter: " + C1.getPerimeter());

        Rectangle R = new Rectangle(2.0, 3.0);
        System.out.println(R.toString());
        System.out.println("Rectangle area: " + R.getArea());
        System.out.println("Rectangle perimeter: " + R.getPerimeter());

        Rectangle R1 = new Rectangle("green", false, 2.0, 3.0);
        System.out.println(R1.toString());
        System.out.println("Rectangle 1 area: " + R1.getArea());
        System.out.println("Rectangle 1 perimeter: " + R1.getPerimeter());

        double length;
        Square Sq = new Square(length = 5.0);
        System.out.println(Sq.toString());
        System.out.println("Square area: " + Sq.getArea());
        System.out.println("Square perimeter: " + Sq.getPerimeter());

        double width;
        Square Sq1 = new Square(width = 8.0);
        System.out.println(Sq1.toString());
        System.out.println("Square 1 area: " + Sq1.getArea());
        System.out.println("Square 1 perimeter: " + Sq1.getPerimeter());
    }
}

