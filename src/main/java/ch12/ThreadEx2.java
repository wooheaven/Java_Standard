package ch12;

class ThreadEx2 {
    public static void main(String[] args) throws Exception {
        MyThread2 t = new MyThread2();
        t.start();
    }
}

class MyThread2 extends Thread {
    public void run() {
        throwException();
    }

    public void throwException() {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}