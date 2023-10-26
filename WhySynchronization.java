class Bus implements Runnable{
    int passenger,available=2;
    Bus(int passenger){
  this.passenger=passenger;//passenger=1
    }
    public synchronized void run(){//after synchronize at a time only 1 thread run
        String name=Thread.currentThread().getName();
  if(available>=passenger){//1>=1 it should run only 1 time
      System.out.println(name+" reserved seat");
      available=available-passenger;//1-1=0
    }
  else System.out.println("Sorry seat not available");
}}
public class WhySynchronization {
    public static void main(String[] args) {


    Bus r =new Bus(1);
    Thread t1=new Thread(r);
    Thread t2=new Thread(r);
    Thread t3=new Thread(r);
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");
          t1.start();
          t2.start();
          t3.start();
}}
