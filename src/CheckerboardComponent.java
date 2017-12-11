import javax.swing.*;
import java.awt.*;
/**
 * Created by RPER7060 on 12/11/2017.
 */
public class CheckerboardComponent extends JComponent {
    /**
     * draws a checkerboard
     * @param g the graphics variable
     */
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        Rectangle box = new Rectangle(0, 0, 200, 200);
        g2.setColor(Color.BLACK);
        g2.draw(box);                       //draws the outline
        box.setSize(25, 25);
        for(int i = 0; i < 8; i++){         //repeats per line
            for(int j = 0; j < 8; j += 2){  //repeats per column
                if (i%2 == 0){              //checks if the line is even
                    j++;
                }
                box.setLocation((25*j), (25*i));
                g2.fill(box);               //draws one box, after changing its location
                if (i%2 == 0){
                    j--;                    //undoes the increment
                }
            }
        }
    }
}
