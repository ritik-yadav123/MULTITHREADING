class Bank extends Thread{
   static int bal=5000,withdraw;
    Bank(int withdraw){
        this.withdraw=withdraw;
    }
  public  static synchronized void runn(){
        String name=Thread.currentThread().getName();
        if(withdraw<=bal){
            System.out.println("Withdrawn money by "+name);
            bal=bal-withdraw;}
        else
        {
            System.out.println("Insufficient balance ");
        }
    }
    public void run(){
        runn();
    }
}

public class StaticSynchronization {
    public static void main(String[] args) {
        Bank obj=new Bank(5000);
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj);
         t1.setName("Ritik");
         t2.setName("Tushar");
           t1.start();
           t2.start();

        Bank obj2=new Bank(5000);//Here synchronized failed bcoz 2 person cant withdraw money
        Thread t3=new Thread(obj2);
        Thread t4=new Thread(obj2);
        t3.setName("Yadav");
        t4.setName("Ahir");
        t3.start();
        t4.start();
    }
}
