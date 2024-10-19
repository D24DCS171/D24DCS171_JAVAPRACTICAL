/**Write a program to solve producer-consumer problem 
using thread synchronization. */

import java.util.LinkedList;

class Buffer {
    private final int MAX_CAPACITY = 5; 
    private LinkedList<Integer> list = new LinkedList<>();

    public synchronized void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            while (list.size() == MAX_CAPACITY) {
                wait();
            }

            System.out.println("Producer produced: " + value);
            list.add(value++);

            notify();

            Thread.sleep(1000);
        }
    }

    public synchronized void consume() throws InterruptedException {
        while (true) {
            while (list.isEmpty()) {
                wait();
            }

            int value = list.removeFirst();
            System.out.println("Consumer consumed: " + value);

            notify();

            Thread.sleep(1000);
        }
    }
}

public class P37 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Thread producerThread = new Thread(() -> {
            try {
                buffer.produce();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                buffer.consume();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
