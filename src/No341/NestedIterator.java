package No341;

import structure.NestedInteger;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Name: Donghang He
 * Date: 2023/3/21 3:02 下午
 * Description:
 */
public class NestedIterator implements Iterator<Integer> {

    private final Iterator<Integer> it;

    public NestedIterator(List<NestedInteger> nestedList) {
        List<Integer> result = new LinkedList<>();
        for (NestedInteger node : nestedList) {
            traverse(node, result);
        }
        this.it = result.iterator();
    }

    @Override
    public Integer next() {
        return it.next();
    }

    @Override
    public boolean hasNext() {
        return it.hasNext();
    }

    private void traverse(NestedInteger root, List<Integer> result) {
        if (root.isInteger()) {
            result.add(root.getInteger());
            return;
        }

        for (NestedInteger child : root.getList()) {
            traverse(child, result);
        }
    }
}

class NestedIterator1 implements Iterator<Integer> {

    private final LinkedList<NestedInteger> list;

    public NestedIterator1(List<NestedInteger> nestedList) {
        list = new LinkedList<>(nestedList);
    }

    @Override
    public boolean hasNext() {
        while (!list.isEmpty() && !list.get(0).isInteger()) {
            List<NestedInteger> first = list.remove(0).getList();
            for (int i = first.size() - 1; i >= 0; i--)
                list.addFirst(first.get(i));
        }
        return !list.isEmpty();
    }

    @Override
    public Integer next() {
        return list.remove(0).getInteger();
    }
}
