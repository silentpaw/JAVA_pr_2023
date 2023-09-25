
public class HumanTest {

    public static void main(String[] args) {

        Head head = new Head("brown");
        Leg leftLeg = new Leg(100);
        Leg rightLeg = new Leg(100);
        Hand leftHand = new Hand(5);
        Hand rightHand = new Hand(5);

        Human human = new Human(head, leftLeg, rightLeg, leftHand, rightHand);
        // Выводим на экран значения свойств головы, ног и рук
        System.out.println("Цвет волос: " + human.getHead().getHairColor());
        System.out.println("Длина левой ноги: " + human.getLeftLeg().getLength());
        System.out.println("Длина правой ноги: " + human.getRightLeg().getLength());
        System.out.println("Количество пальцев на левой руке: " + human.getLeftHand().getFingersCount());
        System.out.println("Количество пальцев на правой руке: " + human.getRightHand().getFingersCount());
        // Изменяем значения свойств головы, ног и рук
        human.getHead().setHairColor("blonde");
        human.getLeftLeg().setLength(110);
        human.getRightLeg().setLength(110);
        human.getLeftHand().setFingersCount(6);
        human.getRightHand().setFingersCount(6);
        // Выводим на экран новые значения свойств головы, ног и рук
        System.out.println("Новый цвет волос: " + human.getHead().getHairColor());
        System.out.println("Новая длина левой ноги: " + human.getLeftLeg().getLength());
        System.out.println("Новая длина правой ноги: " + human.getRightLeg().getLength());
        System.out.println("Новое количество пальцев на левой руке: " + human.getLeftHand().getFingersCount());
        System.out.println("Новое количество пальцев на правой руке: " + human.getRightHand().getFingersCount());
    }
}
