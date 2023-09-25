import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
class MyRectangle extends MyShape {
    private int width, height;

    public MyRectangle(Color color, Point position, int width, int height) {
        super(color, position);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(position.x, position.y, width, height);
    }
}

