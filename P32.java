/**Write a program to create thread which display “Hello 
World” message. A. by extending Thread class B. by using 
Runnable interface.  */

class HelloWorldThread extends Thread {

    public void run() {
        System.out.println("Hello World from Thread Class");
    }
}

class HelloWorldRunnable implements Runnable {

    public void run() {
        System.out.println("Hello World from Runnable Interface");
    }
}

public class CombinedThreadExample {
    public static void main(String[] args) {

        HelloWorldThread thread1 = new HelloWorldThread();
        thread1.start();
    }
}



/*     

-------------------------------PRACTICE  1  --------------------------------

import java.util.*;

class odd extends Thread
{
    int i;
    public void run()
    {
        for(i=0;i<=100;i++){
            if(i%2!=0)
            {
                System.out.println("Odd  :"+i);
            }
        }
    }
}
class even implements Runnable
{
    int i;
    @Override
    public void run()
    {
        for(i=0;i<=100;i++){
            if(i%2==0)
            {
                System.out.println("Even : "+i);
            }
        }
    }
}
public class P32
{
    public static void main (String[] args)
    {
        odd c1 = new odd();
        c1.start();

        even i1 = new even();
        Thread r1 = new Thread(i1);
        r1.start();
    }
}

-------------------------------PRACTICE  2  -------------------------------

import java.util.*;
class odd extends Thread
{
    public void run()
    {
        System.out.println("This is Run() method implementation using Thread class .");
    }
}
class even implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("This is Run() method implementation using Runnable interface .");
    }
}
public class P32
{
    public static void main (String[] args)
    {
        odd c1 = new odd();
        c1.start();

        even i1 = new even();
        Thread r1 = new Thread(i1);
        r1.start();
    }
}*/