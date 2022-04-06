package pers.dozenlee.exp.exp3.exp3_5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author DozenPrince Li
 * @date 2022/3/25
 */
public class ThreadTest{

    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread1");
        MyThread thread2 = new MyThread("Thread2");
        MyThread thread3 = new MyThread("Thread3");
        MyThread thread4 = new MyThread("Thread4");

        ExecutorService pool = Executors.newCachedThreadPool();
        pool.submit(thread1);
        pool.submit(thread2);
        pool.submit(thread3);
        pool.submit(thread4);

        pool.shutdown();
    }
}

class MyThread extends Thread{

    public MyThread(String threadName) {
        super(threadName);
    }

    @Override
    public void run() {
        int runTime = 5;
        int sleepTime = 300;
        for (int i = 0; i < runTime; i++) {
            System.out.println(this.getName());
            try {
                sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


