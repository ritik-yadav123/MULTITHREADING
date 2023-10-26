class C extends Thread{
  public void run(){
       String n=  Thread.currentThread().getName();
      try{for(int i=0;i<3;i++) {System.out.println(n);
       Thread.sleep(1000);
      //Thread.yield();// pause and allow to run another thread which has same priority
      }
  }
  catch (InterruptedException i){
      }
  }
}
public class ThreadSchedular {
    public static void main(String[] args) throws InterruptedException{
   C t1=new C();
   C t2=new C();
   C t3=new C();
     t1.setName("Thread 1");
     t2.setName("Thread 2");
     t3.setName("Thread 3");
      t2.start();
      //t2.join();//It runs first and at that time all other thread don't run
        t3.start();
       // t2.suspend();//pause
        t1.start();
     //   t2.resume();//resume
    }
}
