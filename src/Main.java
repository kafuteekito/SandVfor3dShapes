import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Shape[] shapes = new Shape[10];

        // Populate the array with random shapes
        for (int i = 0; i < shapes.length; i++) {
            int shapeType = random.nextInt(3);
            switch (shapeType) {
                case 0: // Sphere
                    double radius = 1 + random.nextDouble() * 9; // Radius between 1 and 10
                    shapes[i] = new Sphere(radius);
                    break;
                case 1: // Cylinder
                    double cylRadius = 1 + random.nextDouble() * 9; // Radius between 1 and 10
                    double height = 5 + random.nextDouble() * 15; // Height between 5 and 20
                    shapes[i] = new Cylinder(cylRadius, height);
                    break;
                case 2: // Cube
                    double side = 1 + random.nextDouble() * 9; // Side length between 1 and 10
                    shapes[i] = new Cube(side);
                    break;
            }
        }

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.printf("Surface Area: %.2f\n", shape.surfaceArea());
            System.out.printf("Volume: %.2f\n\n", shape.volume());
        }
    }
}