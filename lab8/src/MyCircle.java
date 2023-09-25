import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
class MyCircle extends MyShape {
    private int radius;

    public MyCircle(Color color, Point position, int radius) {
        super(color, position);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(position.x - radius, position.y - radius, 2 * radius, 2 * radius);
    }
}
