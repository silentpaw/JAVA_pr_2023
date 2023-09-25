
public class Hand {
    private int fingersCount;


    public Hand(int fingersCount) {
        this.fingersCount = fingersCount;
    }

    // Метод для получения значения количества пальцев
    public int getFingersCount() {
        return fingersCount;
    }

    // Метод для изменения значения количества пальцев
    public void setFingersCount(int fingersCount) {
        this.fingersCount = fingersCount;
    }
}
