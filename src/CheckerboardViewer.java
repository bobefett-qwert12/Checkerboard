import javax.swing.*;
import java.awt.*;
/**
 * Created by RPER7060 on 12/11/2017.
 */
public class CheckerboardViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300,300);
        frame.setTitle("Target");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CheckerboardComponent checkerboardComponent = new CheckerboardComponent();
        frame.add(checkerboardComponent);
        frame.setVisible(true);
    }
}
