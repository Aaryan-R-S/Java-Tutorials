class Hi extends Thread{
    public void run() {     // run is necessary for threading it runs by default using start() no need to call
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {Thread.sleep(1000);} catch(Exception e){};     // some heavy code
        }
    }
}

class Bye extends Thread{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Bye ");
            try {Thread.sleep(1000);} catch(Exception e){};     // some heavy code
        }
    }
}

public class tut7_threading {
    public static void main(String[] args) throws Exception {
// This is main thread (main method)
        System.out.println("Main thread!");

        Hi x = new Hi();
        Bye y = new Bye();


        x.setName("Thread - Hi");
        y.setName("Thread - Bye");
        System.out.println(x.getName());
        System.out.println(y.getName());


// thread 1
        x.start();
        
        // Both run simultaneously but see how the below statement affects the output
        // try {Thread.sleep(100);} catch (Exception e) {};

// thread 2
        y.start();


        x.join();
        y.join();
// Let above thread die then start further execution
        System.out.println("Done...");
        System.out.println(x.isAlive());
    }    
}
