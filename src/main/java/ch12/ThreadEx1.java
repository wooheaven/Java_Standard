package ch12;

public class ThreadEx1 {

    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1("t1");

        Runnable r = new MyRunnable1();
        Thread t2 = new Thread(r,"t2");

        t1.start();
        t2.start();
    }

}

class MyThread1 extends Thread {
    public MyThread1(String threadName) {
        setName(threadName);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName());
        }
    }
}

class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}