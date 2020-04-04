package No460;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Heap_460 {
    Map<Integer, Node1> cache;
    Queue<Node1> queue;
    int capacity;
    int size;
    int idx = 0;

    public Heap_460(int capacity) {
        cache = new HashMap<>(capacity);
        if (capacity > 0) {
            queue = new PriorityQueue<>(capacity);
        }

        this.capacity = capacity;
    }

    public int get(int key) {
        Node1 node = cache.get(key);
        if (node == null) {
            return -1;
        }

        node.freq++;
        node.idx = idx++;
        queue.remove(node);
        queue.offer(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (capacity == 0) {
            return;
        }

        Node1 node = cache.get(key);
        if (node != null) {
            node.value = value;
            node.freq++;
            node.idx = idx++;
            queue.remove(node);
            queue.offer(node);
        } else {
            if (size == capacity) {
                cache.remove(queue.peek().key);
                queue.poll();
                size--;
            }

            Node1 newNode = new Node1(key, value, idx++);
            cache.put(key, newNode);
            queue.offer(newNode);
            size++;
        }
    }
}

class Node1 implements Comparable<Node1> {
    int key;
    int value;
    int freq;
    int idx;

    public Node1() {}

    public Node1(int key, int value, int idx) {
        this.key = key;
        this.value = value;
        freq = 1;
        this.idx = idx;
    }

    public int compareTo(Node1 node) {
        int diff = freq - node.freq;
        return diff != 0 ? diff : idx - node.idx;
    }
}
