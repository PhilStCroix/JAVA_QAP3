public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point(2.0f, 3.0f);
        System.out.println("Point: " + point);

        MovablePoint movablePoint = new MovablePoint(1.0f, 2.0f, 0.5f, 1.0f);
        System.out.println("MovablePoint: " + movablePoint);

        movablePoint.move();
        System.out.println("MovablePoint after moving: " + movablePoint);
    }
}
