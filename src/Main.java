public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new Circle(7),
                new Triangle(4, 6),
                new Square(6)
        };

        double totalArea = calculateTotalArea(shapes);
        System.out.println("Total Area: " + totalArea);
    }

    public static double calculateTotalArea(Shape[] shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.getArea();
        }
        return total;
    }
}
