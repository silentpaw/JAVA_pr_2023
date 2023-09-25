import javax.swing.JFrame;

public class MyFrame extends JFrame {
    private static final long serialVersionUID = 1L;

    public MyFrame() {
        setTitle("Random Shapes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new MyPanel());
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
