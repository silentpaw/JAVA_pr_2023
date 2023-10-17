public class Animal implements Nameable{
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    @Override
    public String toString() {
        return "Nameable" +
                "name='" + name;
    }
}