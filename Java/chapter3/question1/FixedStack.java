package Java.chapter3.question1;

public class FixedStack {
    private int numberOfStacks = 3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes; 

    public FixedMultiStack(int stackSize) {
        stackCapacity = stackSize;
        values = new int[stackSize * numberOfStacks];
        sizes = new int[numberOfStacks];
    }

    public void push(int stackNum, int value) {
        if (isFull(stackNum)) {
            throw new FullStackException();
        }

        sizes[stackNum]++;
        values[indexOfTop(stackNum)] = value;
    }

    public int pop(int stackNum) {

    }

    public int peek(int stackNum) {

    }

    public boolean isEmpty(int stackNum) {

    }

    public boolean isFull(int stackNum) {

    }

    public int indexOfTop(int stackNum) {
        
    }
}
