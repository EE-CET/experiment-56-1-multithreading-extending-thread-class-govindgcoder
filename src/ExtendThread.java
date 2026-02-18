class MyThread extends Thread {
    // TODO: Override the run() method
    // Inside run(), print "Thread is running"
    @Override
    public void run(){
        System.out.print("Thread is running");
    }
}

public class ExtendThread {
    public static void main(String[] args) {
        // Create an object of MyThread
        MyThread mt = new MyThread();
        // Start the thread using start() method
        mt.start();
    }
}
