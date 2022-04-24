public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle("r1", "blue", 5, 5, 30, 50);
        Rectangle r2 = new Rectangle("r2", "red", 6, 3, 10, 20);
        System.out.println(r1.getArea());

        // System.out.println(Math.PI);
        Circle c1 = new Circle("c1", "purple", 10, 20, 5);
        Circle c2 = new Circle("c2", "green", 15, 19, 7);
        System.out.println(c1.getArea());
        System.out.println(c1.getX());
        // test !!!
    } // end of Main method
} // end of Main class
