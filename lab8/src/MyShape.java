import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;


abstract class MyShape {
    protected Color color;
    protected Point position;

    public MyShape(Color color, Point position) {
        this.color = color;
        this.position = position;
    }

    public abstract void draw(Graphics g);
}