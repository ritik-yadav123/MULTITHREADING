class B implements Runnable{
    public void run(){
        try {for (int i=0;i<5;i++)
        { System.out.println("Hi");
        Thread.sleep(1000);}
    }
    catch (InterruptedException i){
        }
    }
}
public class ExtendingRunnableInterfaces {
    public static void main(String[] args) throws InterruptedException{
       B r=new B();
       Thread t=new Thread(r);
       t.start();//can do task in 5 sec
      for (int i=0;i<5;i++) {System.out.println("Ritik");
        t.sleep(1000);}}
}
