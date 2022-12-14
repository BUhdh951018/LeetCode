package No225;

import java.util.Arrays;

/**
 * Name: Donghang He
 * Date: 2022/12/7 9:52 下午
 * Description:
 */
public class MyArrayStack {
    private int[] storage;
    private int capacity;
    private int count;
    private static final int GROW_FACTOR = 2;

    public MyArrayStack() {
        this.capacity = 8;
        this.storage = new int[8];
        this.count = 0;
    }

    public MyArrayStack(int initialCapacity) {
        if (initialCapacity < 1)
            throw new IllegalArgumentException("Capacity too small.");

        this.capacity = initialCapacity;
        this.storage = new int[initialCapacity];
        this.count = 0;
    }

    public void push(int value) {
        if (count == capacity) {
            ensureCapacity();
        }

        storage[count++] = value;
    }

    private void ensureCapacity() {
        int newCapacity = capacity * GROW_FACTOR;
        storage = Arrays.copyOf(storage, newCapacity);
        capacity = newCapacity;
    }

    public int pop() {
        if (count == 0)
            throw new IllegalArgumentException("Stack is empty.");

        count--;
        return storage[count];
    }

    public int peek() {
        if (count == 0) {
            throw new IllegalArgumentException("Stack is empty.");
        } else {
            return storage[count - 1];
        }
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }
}
