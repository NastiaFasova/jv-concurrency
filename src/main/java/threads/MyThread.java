package threads;

import org.apache.log4j.Logger;

public class MyThread extends Thread {
    private static final int COUNT = 100;
    private static final Logger LOGGER = Logger.getLogger(MyThread.class);

    @Override
    public void run() {
        for (int i = 0; i < COUNT; i++) {
            LOGGER.info(getName() + " value = " + i);
        }
        LOGGER.info(getName() + " finished the race");
    }
}
