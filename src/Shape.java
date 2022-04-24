abstract class Shape {
    private String name;
    private String color;
    private double x;
    private double y;

    Shape(String name, String color, double x, double y) {
        this.name = name;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public abstract double getArea();

    public abstract Point getCenterPoint();


} // end of Shape class
