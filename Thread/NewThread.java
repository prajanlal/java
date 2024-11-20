
public class Newthread implements Runnable {
    Thread t;

    Newthread() {
        t = new Thread(this, "Demothread");
        System.out.println("child thread" + t);
        t.start();
    }

    public void run() {
        {
            try {
                for (int i = 5; i > 0; i--) {
                    System.out.println("child thread: "+ i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.println("child thread Interrupted");
                System.out.println("child thread Exit");
            }
        }
        class demothread {
            public static void main(String args[]) {
                new NewThread();
                {
                    try {
                        for (int i = 5; i > 0; i--) {
                            System.out.println("Main thread: "+ i);
                            Thread.sleep(1000);
                        }
                    } catch (InterruptedException e) {
                        System.out.println("Main thread Interrupted");
                    }
                    System.out.println("Main thread Existing");
                }
            }
        }
    }
}



