public class Count {

    private static final int MAX = 100;
    private int count = 0;

    public int incrementCount() {
        return count++;
    }

    public boolean isTerminated() {
        return count != MAX;
    }
}
