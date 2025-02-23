public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println("Calculadora de área para diferentes figuras.");

        double circle = circleArea(5);
        double rectangle = rectangleArea(4, 6);
        double triangle = triangleArea(3, 7);

        System.out.println("Área del círculo: " + circle);
        System.out.println("Área del rectángulo: " + rectangle);
        System.out.println("Área del triángulo: " + triangle);
    }

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // método Iman triangulo
    public static double triangleArea(double base, double height) { 
        return (base * height) / 2; 
    } 

    // método rectangulo Daniel
    public static double rectangleArea(double length, double width) {
        return length * width;
    }
}
