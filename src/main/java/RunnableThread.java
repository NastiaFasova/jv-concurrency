import org.apache.log4j.Logger;

public class RunnableThread implements Runnable {
    private static final Logger LOGGER = Logger.getLogger(RunnableThread.class);
    private final Count count;

    public RunnableThread(Count count) {
        this.count = count;
    }

    public void run() {
        while (count.isTerminated()) {
            LOGGER.info(Thread.currentThread().getName() + " value = "
                    + count.incrementCount());
        }
        System.out.println(Thread.currentThread().getName()
                + " has terminated!!!");
    }
}
