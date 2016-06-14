package ch12;

public class ThreadEx5 {
    static long startTime2 = 0;

    public static void main(String[] args){
        MyThread5 th1 = new MyThread5();
        startTime2 = System.currentTimeMillis();
        th1.start();

        long startTime1 = System.currentTimeMillis();
        for(int i=0;i<300;i++){
            System.out.print("-");
        }

        System.out.println("\n소요시간1:"+(System.currentTimeMillis()-startTime1));
    }
}

class MyThread5 extends Thread {
    public void run(){
        for(int i=0;i<300;i++){
            System.out.print("|");
        }
        System.out.println("\n소요시간2:"+(System.currentTimeMillis()-ThreadEx5.startTime2));
    }
}