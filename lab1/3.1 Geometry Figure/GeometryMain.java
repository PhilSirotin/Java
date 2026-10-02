public class GeometryMain {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5),
            new Rectangle(4, 6),
            new TriangleShape(3, 8)
        };

        double totalArea = 0;

        for (Shape shape : shapes) {
            double area = shape.calculateArea();
            System.out.printf("Площадь: %.2f%n", area);
            totalArea += area;
        }

        System.out.printf("Общая площадь всех фигур: %.2f%n", totalArea);
    }
}