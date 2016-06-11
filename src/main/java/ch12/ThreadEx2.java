package ch12;

class ThreadEx2 {
    public static void main(String[] args) throws Exception {
        MyThread3 t = new MyThread3();
        t.start();
    }
}

class MyThread3 extends Thread {
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