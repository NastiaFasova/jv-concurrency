package threads;

import org.apache.log4j.Logger;

public class RunnableThread implements Runnable {
    private static final int COUNT = 100;
    private static final Logger LOGGER = Logger.getLogger(RunnableThread.class);
    private String name;

    public RunnableThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < COUNT; i++) {
            LOGGER.info(name + " value = " + i);
        }
        LOGGER.info(name + " finished the race");
    }
}
