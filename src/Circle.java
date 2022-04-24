public class Circle extends Shape {
    private double radius;

    Circle(String name, String color, double x, double y, double radius) {
        super(name, color, x, y);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        //double area = Math.PI * (radius * radius);
        return Math.PI * (this.radius * this.radius);
    }

    @Override
    public Point getCenterPoint() {
        // not correct
        double xValue = super.getX();
        double yValue = super.getY();
        Point p = new Point(xValue, yValue);
        return p;

    }
} // end of Circle class
