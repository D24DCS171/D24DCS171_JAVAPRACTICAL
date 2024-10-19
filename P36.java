/**Write a program to create three threads ‘FIRST’, 
‘SECOND’, ‘THIRD’. Set the priority of the ‘FIRST’ 
thread to 3, the ‘SECOND’ thread to 5(default) and the 
‘THIRD’ thread to 7. */

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName() + 
                           ", Priority: " + Thread.currentThread().getPriority());
    }
}
public class P36
{
    public static void main(String[] args) {

        MyThread thread1 = new MyThread("FIRST");
        MyThread thread2 = new MyThread("SECOND");
        MyThread thread3 = new MyThread("THIRD");


        thread1.setPriority(3); 
        thread2.setPriority(Thread.NORM_PRIORITY); 
        thread3.setPriority(7); 

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
