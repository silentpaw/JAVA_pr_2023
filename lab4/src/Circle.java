
public class Circle {
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    // Метод для получения значения радиуса окружности
    public double getRadius() {
        return radius;
    }

    // Метод для изменения значения радиуса окружности
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Метод для вычисления площади окружности
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Метод для вычисления длины окружности
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}


