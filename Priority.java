
class D extends Thread{
   public void run(){
       System.out.println(Thread.currentThread().getName());
       System.out.println(Thread.currentThread().getPriority());
}}
public class Priority{
    public static void main(String[] args) {
       D t1=new D();
       D t2=new D();
       D t3=new D();
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");
         t1.setPriority(2);
         t2.setPriority(6);//6 comes second
         t3.setPriority(7);//7 comes first in digits
           t1.start();
           t2.start();
           t3.start();
    }
}
