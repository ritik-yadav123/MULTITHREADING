class msg{
    public  void show(String name){
        ;;;;;;;;;;;//100 LOC   //HOME
        synchronized (this){//Synchronized block
            for (int i=0;i<3;i++) System.out.println("How Are You  "+name);}
        ;;;;;;;;;//100 LOC  //SCHOOL
    }}
class OurThread extends Thread{
  msg m;
  String name;
  OurThread(msg m,  String name){
      this.m=m;
      this.name=name;}
  public void run(){
      m.show(name);}}
public class BlockLevelSynchronization {
    public static void main(String[] args) {
        msg m =new msg();
        OurThread t1=new OurThread(m,"Ritik");
        OurThread t2=new OurThread(m,"Yadav");
         t1.start();
         t2.start();}}
