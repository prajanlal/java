import java.io.*;
class Multithread implements Runnable{
  String name;
  Thread t;
  Multithread (String Threadname)
  {
    name=Threadname;
    t=new Thread(this,name);
    System.out.println("new thread"+t);
    t.start();
  }
  public void run(){
    try
      {
        for(i=5;i>0;i--)
          System.out.println("name+" "+i);
          Thread.sleep(1500);
      }
    catch(InterruptedException e){
      System.out.println(name+"Interrupted");
    }
      System.out.println(name+"Existing");
  }
}
      class demothread{
        public static void main(String ab[])
        {
          new Multithread("one");
          new Multithread("two");
          new Multithread("three");
          try
            {
              Thread.sleep(5000);
            }
          catch(InterruptedException e){
            System.out.println("Main thred Interrupted");
          }
          System.out.println("Main thread Existing");
        }
      }

      
