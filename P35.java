/**Write a program to increment the value of one variable by 
one and display it after one second using thread using 
sleep() method */

import java.util.*;
class mynumber extends Thread
{
    private int a;

    public mynumber(int a) {
        this.a = a;
    }
    public void run()
    {
            try 
            {
                System.out.println("Initial Value: " + a);
                Thread.sleep(1000);
                a++;
                System.out.println("Value after 1 second: " + a);
            } catch (InterruptedException e)
            {
                System.out.println("Thread interrupted");
            }
    }
}
public class P35   
{
    public static void main(String[] args)
    {
        mynumber n1 = new mynumber(10);
        n1.start();
    }
}