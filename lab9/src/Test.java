public class Test {
    public static void main(String[] args) {
        Priceable p = new Excursion("Путевка в Геленжик", 55400, 1.205);
        System.out.println(p);
        System.out.println(p.getPrice());
        p = new Laptop(12000, "Эппл");
        System.out.println(p);
        p = new Mouse(800, 1800, "Белый");
        System.out.println(p);
    }

}
