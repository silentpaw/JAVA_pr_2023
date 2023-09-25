// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public abstract class Dish {
    private String material;
    public Dish(String material) {


        this.material = material;

    }
    public abstract void use();

    public String getMaterial() {
        return material;
    }

}