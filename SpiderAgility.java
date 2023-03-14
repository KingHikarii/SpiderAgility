import java.util.Random;
import java.lang.Thread;
public class SpiderAgility
{
    public static void main(String args[]) throws InterruptedException{
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
