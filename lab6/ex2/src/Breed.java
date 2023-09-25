public class Breed extends Dog {
    public String breed;


    public Breed(int age, String breed) {
        super(age);
        this.breed= breed;



    }
    public String getBreed() {
        return breed;
    }

    @Override
    public void use(){
        System.out.println("Вы взяли собаку!");
    }
    @Override
    public String toString(){

        return "Порода собаки " + breed;
    }
}
