public class DishTest {
    public static void main(String[] args) {
        Plate plate = new Plate("Ceramic", 500, 20, 24);
        Cup cup = new Cup("Glass", 300, 40, 14);

        System.out.println("Plate material: " + plate.getMaterial());
        System.out.println("Plate lenght: " + plate.getLenght());
        System.out.println("Plate weight: " + plate.getWeight());

        System.out.println("Cup material: " + cup.getMaterial());
        System.out.println("Cup lenght: " + cup.getLenght());
        System.out.println("Cup high: " + cup.getHigh());

        plate.use();
        cup.use();
    }
}
