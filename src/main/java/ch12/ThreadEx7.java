package ch12;

import javax.swing.JOptionPane;

public class ThreadEx7 {
    public static void main (String[] args){
        MyThread7 th1 = new MyThread7();
        th1.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
        System.out.println("입력하시 값은 "+ input +" 입니다.");
    }
}
 class MyThread7 extends Thread {
     public void run() {
         for(int i=10;i>0;i--){
             System.out.println(i);
             try{
                 Thread.sleep(1000);
             } catch (Exception e) {
             }
         }
     }
 }
