import javax.swing.JFrame;
import javax.swing.JPanel;

public class gui {
    public static void main(String[] args) {
        // making a gui:
        JFrame window = new JFrame();
        window.setSize(600,500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        JPanel wall = new JPanel();
        window.add(wall);
    }
}
