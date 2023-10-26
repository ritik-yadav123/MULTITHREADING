class A extends Thread{
    public void run(){
       try{ for (int i=0;i<5;i++){
            System.out.println("Ritik ");
            Thread.sleep(1000);}
        }
       catch (InterruptedException i){
           System.out.println("t terminated");
       }
    }
}

public class ExtendingThreadClass {
    public static void main(String[] args) throws InterruptedException{
        A t=new A();
        t.start();
        t.interrupt();// it terminate thread after sleep  
     //   t.start();//take 5 sec if fun==run
        for (int i=0;i<5;i++){
            System.out.println("Yadav");
            Thread.sleep(1000);
        }
    }
}
