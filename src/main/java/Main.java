public class Main {

    public static void main(String[] args) {
        Count count = new Count();
        MyThread myThread = new MyThread(count);
        RunnableThread thread = new RunnableThread(count);
        Thread runnableThread = new Thread(thread);

        myThread.start();
        runnableThread.start();
    }
}
