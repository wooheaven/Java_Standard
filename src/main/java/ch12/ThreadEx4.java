package ch12;

public class ThreadEx4 {
    public static void main(String[] args){
        long startTime1 = System.currentTimeMillis();
        for(int i=0;i<300;i++){
            System.out.print("-");
        }
        System.out.println("\n소요시간1:"+(System.currentTimeMillis()-startTime1));
        
        long startTime2 = System.currentTimeMillis();
        for(int i=0;i<300;i++){
            System.out.print("|");
        }
        System.out.println("\n소요시간2:"+(System.currentTimeMillis()-startTime2));
    }
}
