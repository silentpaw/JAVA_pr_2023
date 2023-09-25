public class Plate extends Dish {
    public int lenght;
    public int weight;
    public int high;

    public Plate(String material, int lenght, int weight, int high) {
        super(material);
        this.high = high;
        this.lenght = lenght;
        this.weight = weight;


    }
    public int getHigh() {
        return high;
    }

    public void setHigh(int personCount) {
        this.high = high;
    }
    public int getWeight() {
        return weight;
    }

    public void setWeight(int personCount) {
        this.weight= weight;
    }
    public int getLenght() {
        return lenght;
    }

    public void setLenght(int personCount) {
        this.lenght = lenght;
    }
@Override
    public void use(){
        System.out.println("Вы взяли тарелку!");
    }
    public String toString(){

        return "Тарелка: "+
                "Длинна - " + lenght +
                ", Ширина - " + weight +
                ", Высота - " + high;
    }

}
