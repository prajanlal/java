package package1;
public class A{
    public void displayA(){
        System.out.println("inside the class A");
    }
}
 package package2;
public class B {
    protected int n=100;

    public void displayB(){
          System.out.println("inside the class B");
            System.out.println("the value of n="+n);
    }
}
      import package1.A;
      import package2.B;
      class packagetest{
          public static void main(String ab[]){
              A a1=new A();
              B b1=new B();
              a1.displayA();
              b1.displayB();
              
          }
      }
