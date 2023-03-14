import java.awt.*;
import java.util.Random;
import java.lang.Thread;
import javax.swing.*;

public class SpiderAgility {
    public static void Application_Launcher() {
        JPanel content_pane;

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    SpiderAgility frame = new SpiderAgility();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    public void SpiderAgility() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(100, 100, 450, 300);
            content_pane = new JPanel();
            content_pane.setBorder(new EmptyBorder(5, 5, 5, 5));
            content_pane.setLayout(new BorderLayout(0, 0));
            setContentPane(content_pane);
        }
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
