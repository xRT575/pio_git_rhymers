package edu.kis.vh.nursery;

public class
DefaultCountingOutRhymer {
    private final int TABLESIZE=12;
    private final int MINUS_ONE=-1;
    private int[] NUMBERS = new int[TABLESIZE];

    public int total = MINUS_ONE;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == MINUS_ONE;
    }

    public boolean isFull() {
        return total == TABLESIZE-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return MINUS_ONE;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return MINUS_ONE;
        return NUMBERS[total--];
    }

}
