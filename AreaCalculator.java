public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println("Calculadora de área para diferentes figuras.");
        
        double circle = circleArea(5);
        double rectangle = rectangleArea(4, 6);
        double triangle = triangleArea(5, 3);
        
        System.out.println("Área del círculo: " + circle);
        System.out.println("Área del rectángulo: " + rectangle);
        System.out.println("Área del triángulo: " + triangle);
    }

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double rectangleArea(double width, double height) {
        return width * height;
    }

    public static double triangleArea(double base, double height) {
        return (base * height) / 2;
    }
}
