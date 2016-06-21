package ch12;

public class ThreadEx9 {
    public static void main(String args[]) {
        MyThread9First th1 = new MyThread9First();
        MyThread9Second th2 = new MyThread9Second();
        
        th2.setPriority(7);
        System.out.println("Priority of th1(-) :" + th1.getPriority());
        System.out.println("Priority of th2(|) :" + th2.getPriority());
        
        th1.start();
        th2.start();
    }
}

class MyThread9First extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("-");
            try {
                MyThread9First.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread9Second extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("|");
            try {
                MyThread9Second.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}