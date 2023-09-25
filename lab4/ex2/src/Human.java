// Объявляем класс Human
public class Human {
    private Head head; // Свойство - голова
    private Leg leftLeg; // Свойство - левая нога
    private Leg rightLeg; // Свойство - правая нога
    private Hand leftHand; // Свойство - левая рука
    private Hand rightHand; // Свойство - правая рука

    // Конструктор класса Human
    public Human(Head head, Leg leftLeg, Leg rightLeg, Hand leftHand, Hand rightHand) {
        this.head = head;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.leftHand = leftHand;
        this.rightHand = rightHand;
    }

    // Метод для получения значения головы
    public Head getHead() {
        return head;
    }

    // Метод для изменения значения головы
    public void setHead(Head head) {
        this.head = head;
    }

    // Метод для получения значения левой ноги
    public Leg getLeftLeg() {
        return leftLeg;
    }

    // Метод для изменения значения левой ноги
    public void setLeftLeg(Leg leftLeg) {
        this.leftLeg = leftLeg;
    }

    // Метод для получения значения правой ноги
    public Leg getRightLeg() {
        return rightLeg;
    }

    // Метод для изменения значения правой ноги
    public void setRightLeg(Leg rightLeg) {
        this.rightLeg = rightLeg;
    }

    // Метод для получения значения левой руки
    public Hand getLeftHand() {
        return leftHand;
    }

    // Метод для изменения значения левой руки
    public void setLeftHand(Hand leftHand) {
        this.leftHand = leftHand;
    }

    // Метод для получения значения правой руки
    public Hand getRightHand() {
        return rightHand;
    }

    // Метод для изменения значения правой руки
    public void setRightHand(Hand rightHand) {
        this.rightHand = rightHand;
    }
}