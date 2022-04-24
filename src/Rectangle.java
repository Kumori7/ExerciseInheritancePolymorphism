public class Rectangle extends Shape {

    private double height;
    private double width;


    Rectangle(String name, String color, double x, double y, double height, double width) {
        super(name, color, x, y);
        this.height = height;
        this.width = width;

    }


    public boolean isSquare() {
        if (this.height == this.width) {
            return true;
        } // end of if statement
        return false;
    }

    @Override
    public double getArea() {

        return this.width * this.height;
    }

    @Override
    public Point getCenterPoint() {
        double xAxis = super.getX() + this.width / 2;
        double yAxis = super.getY() + this.height / 2;
        Point p = new Point(xAxis, yAxis);
        return p;
    }

    public String toString() {
        return super.getName() +
                super.getColor() + super.getX() + super.getX() + this.height + this.width;
    }

} // end of class Rectangle
