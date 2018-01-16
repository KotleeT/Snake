
package snake;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JFrame;


/**
 *
 * @author Mateusz
 */

public class Snake {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake");
        frame.setContentPane(new Game());
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setPreferredSize(new Dimension(Game.WIDTH, Game.HEIGHT));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    }
    
}
