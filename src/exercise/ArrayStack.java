package exercise;

import com.sun.corba.se.spi.ior.ObjectKey;

import java.util.Iterator;

/**
 * Name: Donghang He
 * Date: 2022/3/14 5:20 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class ArrayStack<Item> implements MyStack<Item> {

    private Item[] a = (Item[]) new Object[1];

    private int N = 0;

    @Override
    public MyStack<Item> push(Item item) {
        check();
        a[N++] = item;
        return this;
    }

    @Override
    public Item pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("stack is empty");
        }

        Item item = a[--N];
        check();
        a[N] = null;
        return item;
    }

    private void check() {
        if (N >= a.length) {
            resize(2 * a.length);
        } else if (N > 0 && N <= a.length / 4) {
            resize(a.length / 2);
        }
    }

    private void resize(int size) {
        Item[] tmp = (Item[]) new Object[size];

        if (N >= 0) System.arraycopy(a, 0, tmp, 0, N);

        a = tmp;
    }

    @Override
    public boolean isEmpty() {
        return N == 0;
    }

    @Override
    public int size() {
        return N;
    }

    @Override
    public Iterator<Item> iterator() {
        return new Iterator<Item>() {
            private int i = N;
            @Override
            public boolean hasNext() {
                return i > 0;
            }

            @Override
            public Item next() {
                return a[--i];
            }
        };
    }
}
