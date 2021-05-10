class Counter{
    int count;
    // Synchronized means only one thread will execute a method so that other won't interfere
    public synchronized void increment(){
        count++;
    };
}

public class tut8_threading {
    public static void main(String[] args) throws Exception {
        Counter c = new Counter();

        // Shortcut to create thread
        Thread t1 = new Thread(() -> {
                    for(int i = 0; i<1000; i++){
                        c.increment();
                    }
                }
            );

        Thread t2 = new Thread(() -> {
                    for(int i = 0; i<1000; i++){
                        c.increment();
                    }
                }
            );
        
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count " + c.count);
    }
}
