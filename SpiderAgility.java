import java.awt.*;
import java.util.Random;
import java.lang.Thread;
import javax.swing.*;
import java.lang.*;
import javax.swing.border.EmptyBorder;




public class SpiderAgility {
    public void Application_Launcher() {

            JFrame frame = new JFrame("My First GUI");
            //"C:/Users/Yeshu/OneDrive/Desktop/Pictures and Videos/App_Spider"
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300,300);
            JButton button = new JButton("Press");
            frame.getContentPane().add(button); // Adds Button to content pane of frame
            frame.setVisible(true);
            frame.setIconImage(new ImageIcon(getClass().getResource("/images/App_Spider.png")).getImage());

        }





    public static void main(String args[]) throws InterruptedException
    {
        SpiderAgility al = new SpiderAgility();
        al.Application_Launcher();

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