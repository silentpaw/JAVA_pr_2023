import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.util.Scanner;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите путь к файлу: ");
        String filePath = scanner.nextLine();
        File file = new File(filePath);
        if(!file.exists()){
            System.out.println("Файл не найден");
            return;
        }
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage(filePath);
        Dimension screenSize = toolkit.getScreenSize();
        int width = (int)screenSize.getWidth();
        int height = (int)screenSize.getHeight();
        JFrame frame = new JFrame();
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        Graphics g = frame.getGraphics();

        // Задаем координаты и размеры первого кадра
        int x = 0;
        int y = 0;
        int frameWidth = 2000;
        int frameHeight = 1000;

        // Задаем количество кадров и текущий кадр
        int framesCount = 3;
        int currentFrame = 0;

        while(true) {
            // Очищаем экран
            g.clearRect(0, 0, width, height);

            // Рисуем текущий кадр
            g.drawImage(image, x, y, x + frameWidth, y + frameHeight,
                    currentFrame * frameWidth, 0,
                    currentFrame * frameWidth + frameWidth, frameHeight, null);

            // Увеличиваем номер текущего кадра
            currentFrame++;

            // Если достигли последнего кадра, переходим на первый
            if(currentFrame == framesCount) {
                currentFrame = 0;
            }

            // Задержка между кадрами
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}