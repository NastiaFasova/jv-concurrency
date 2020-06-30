import org.apache.log4j.Logger;

public class MyThread extends Thread {
    private static final Logger LOGGER = Logger.getLogger(MyThread.class);
    private final Count count;

    public MyThread(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        while (count.isTerminated()) {
            LOGGER.info(getName() + " value = " + count.incrementCount());
        }
        LOGGER.info(getName() + " has terminated!!!");
    }
}
