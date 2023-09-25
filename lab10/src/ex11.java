import java.util.Scanner;
public class ex11 {    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int count = 0; // счетчик единиц
    int number; // текущее число
    do {
        number = scanner.nextInt(); // считываем число
         if (number == 1) {
        count++; // увеличиваем счетчик, если число равно 1
         }
    } while (number != 0 || scanner.nextInt() != 0); // продолжаем чтение, пока не встретим два нуля подряд
    System.out.println("Количество единиц: " + count);    }
}
