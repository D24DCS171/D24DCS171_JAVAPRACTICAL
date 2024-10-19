/**Write a java program that implements a multi-thread 
application that has three threads. First thread generates 
random integer every 1 second and if the value is even, 
second thread computes the square of the number and 
prints. If the value is odd, the third thread will print the 
value of cube of the number.  */

import java.util.Random;

class RandomNo extends Thread {
    int randomNum;

    public void run() {
        Random random = new Random();
        while (true) {
                randomNum = random.nextInt(20);
                System.out.println("Random Number: " + randomNum);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

class EvenNo extends Thread {
    int num;
    public void run()
     {
         if (num % 2 == 0){
            int square = num * num;
            System.out.println("Square of " + num + " is: " + square+"\n\n");
         }
    }
}

class OddNo extends Thread {
    int num;
    public void run() 
    {
        if (num % 2 != 0){

            int cube = num * num * num;
            System.out.println("Cube of " + num + " is: " + cube+"\n\n");
        }
    }
}
public class P34 {
    public static void main(String[] args) 
    {
        RandomNo r1 = new RandomNo();
        r1.start();

        EvenNo e1 = new EvenNo();
        e1.start();

        OddNo o1 = new OddNo();
        o1.start();
    }
}
