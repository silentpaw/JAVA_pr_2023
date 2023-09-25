import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;
import javax.swing.JPanel;
class MyPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    private static final int WIDTH = 600;
    private static final int HEIGHT = 400;
    private static final int SHAPE_COUNT = 20;

    private MyShape[] shapes;

    public MyPanel() {
        setBackground(Color.WHITE);
        setPreferredSize(new java.awt.Dimension(WIDTH, HEIGHT));

        shapes = new MyShape[SHAPE_COUNT];
        Random random = new Random();

        for (int i = 0; i < SHAPE_COUNT; i++) {
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            Point position = new Point(random.nextInt(WIDTH), random.nextInt(HEIGHT));
            int shapeType = random.nextInt(2);
            if (shapeType == 0) {
                int width = random.nextInt(100) + 20;
                int height = random.nextInt(100) + 20;
                shapes[i] = new MyRectangle(color, position, width, height);
            } else {
                int radius = random.nextInt(50) + 20;
                shapes[i] = new MyCircle(color, position, radius);
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (MyShape shape : shapes) {
            shape.draw(g);
        }
    }
}

