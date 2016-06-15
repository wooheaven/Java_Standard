package ch12;

import javax.swing.JOptionPane;

class CountThread extends Thread {
    public void run(){
        for(int i=10;i>0;i--){
            if(ThreadEx8.inputCheck) {
                return;
            } else {
                System.out.println(i);
                try{
                    sleep(1000);
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
        System.out.println("10초 도안 값이 입력되지 않아 종료합니다.");
        System.exit(0);
    }
}

class InputThread extends Thread {
    public void run() {
        System.out.println("10초안에 값을 입력해야 합니다.");
        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        ThreadEx8.inputCheck = true;
        System.out.println("입력값은 " + input + " 입니다.");
        System.out.println("종료합니다.");
    }
}

public class ThreadEx8 {

    static boolean inputCheck = false;

    public static void main(String[] args) {
        InputThread inTh = new InputThread();
        inTh.setName("InputThread");
        
        CountThread cntTh = new CountThread();
        cntTh.setName("CountThread");
        
        inTh.start();
        cntTh.start();
    }
}
