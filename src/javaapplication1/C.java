
import static java.lang.Thread.sleep;

class C extends Thread
{
    public void run()
    {
        for(int k=1;k<=5;k++)
        {
            System.out.println("\tFrom Thread C: k= "+k);
            if (k==1)
                try
                {
                    sleep(10000);
                }catch(Exception e)
                {
                }
        }
        System.out.println("Exit from C");
    }
}
