public class CircleTest {

    public static void main(String[] args) {

        Circle circle = new Circle(5);
        // Выводим на экран значение радиуса, площади и длины окружности
        System.out.println("Радиус окружности: " + circle.getRadius());
        System.out.println("Площадь окружности: " + circle.getArea());
        System.out.println("Длина окружности: " + circle.getCircumference());
        // Изменяем значение радиуса на 7
        circle.setRadius(7);
        // Выводим на экран новое значение радиуса, площади и длины окружности
        System.out.println("Новый радиус окружности: " + circle.getRadius());
        System.out.println("Новая площадь окружности: " + circle.getArea());
        System.out.println("Новая длина окружности: " + circle.getCircumference());
    }
}
