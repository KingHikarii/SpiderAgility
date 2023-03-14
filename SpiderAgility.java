import java.util.Random;
import java.lang.Thread;
public class SpiderAgility
{
    public static void main(String args[]) throws InterruptedException{
    Random rand_num = new Random();  //Put this in a class that will establish
    int four = 4;
    int limit_num;

    int i = 0;

    while (i == 0) //Put this in another class called: (Randomizer Number)
    {
        limit_num = rand_num.nextInt(four);
        System.out.println(limit_num);
        Thread.sleep(2000);
        i++;

        if (i == 5)
        {
            System.out.println("End.");
        }
    }
    }
}
