public class DogTest {
    public static void main(String[] args) {
        Breed dog = new Breed(3, "Такса");


        System.out.println("Порода собаки: " + dog.getBreed());
        System.out.println("Возраст собаки: " + dog.getAge());




        dog.use();

    }
}
