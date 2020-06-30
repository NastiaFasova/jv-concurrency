import threads.MyThread;
import threads.RunnableThread;

public class Main {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        RunnableThread thread = new RunnableThread("Thread-1");
        Thread runnableThread = new Thread(thread);

        myThread.start();
        runnableThread.start();
    }
}
