package No677;

/**
 * Name: Donghang He
 * Date: 2022/3/20 8:07 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Trie_677 {
    private class Node {
        Node[] child = new Node[26];
        int value;
    }

    private Node root = new Node();

    public Trie_677() {

    }

    public void insert(String key, int val) {
        insert(key, val ,root);
    }

    private void insert(String key, int val, Node node) {
        if (node == null)
            return;
        if (key.length() == 0) {
            node.value = val;
            return;
        }

        int index = index(key.charAt(0));
        if (node.child[index] == null) {
            node.child[index] = new Node();
        }

        insert(key.substring(1), val, node.child[index]);
    }

    public int sum(String prefix) {
        return sum(prefix, root);
    }

    private int sum(String prefix, Node node) {
        if (node == null)
            return 0;
        if (prefix.length() != 0) {
            int index = index(prefix.charAt(0));
            return sum(prefix.substring(1), node.child[index]);
        }

        int sum = node.value;
        for (Node child : node.child) {
            sum += sum(prefix, child);
        }
        return sum;
    }

    private int index(char c) {
        return c - 'a';
    }
}
