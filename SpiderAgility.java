import java.awt.*;
import java.util.Random;
import java.lang.Thread;
import javax.swing.*;
import java.lang.*;
import javax.swing.border.EmptyBorder;




public class SpiderAgility extends JFrame{
    private ImageIcon image1;
    private JLabel label1;
    public void Application_Launcher() {

            JFrame frame = new JFrame("Spider-Man's Agility");
            //"C:/Users/Yeshu/OneDrive/Desktop/Pictures and Videos/App_Spider"
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(700,700);
            frame.add(new JLabel(new ImageIcon((getClass().getResource("/images/App_Left.png")))));
            //JButton button = new JButton("Press");
            //frame.getContentPane().add(button); // Adds Button to content pane of frame
            frame.setVisible(true);
            frame.setIconImage(new ImageIcon(getClass().getResource("/images/App_Spider.png")).getImage());
            //frame.add(new JLabel(new ImageIcon((getClass().getResource("/images/App_Left.png")))));

        }
        SpiderAgility()
        {
        setLayout(new FlowLayout());

        image1 = new ImageIcon(getClass().getResource("/images/App_Down.png"));
        label1 = new JLabel(image1);
        add(label1);
        }





    public static void main(String args[]) throws InterruptedException
    {
        SpiderAgility al = new SpiderAgility();
        SpiderAgility al_2 = new SpiderAgility();
        al.Application_Launcher();
        al_2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        al_2.setVisible(true);
        al_2.pack();

        Random rand_num = new Random();  //Put this in a class that will establish
        int four = 4;
        int limit_num;
        int i = 0;

        while (i != 30) //Put this in another class called: (Randomizer Number)
        {
            limit_num = rand_num.nextInt(four);
            //System.out.println(limit_num);

            if(limit_num == 0)
            {
                System.out.println();
                System.out.println("Jump Up!");
            }

            else if(limit_num == 1)
            {
                System.out.println();
                System.out.println("Duck!");
            }

            else if(limit_num == 2)
            {
                System.out.println();
                System.out.println("Move right!");
            }
            else if(limit_num ==  3)
            {
                System.out.println();
                System.out.println("Move left");
            }

            Thread.sleep(1000); //Important, this is so that the athlete wil be able to change the speed once the GUI are set up.
            i++;
        }

    }

}