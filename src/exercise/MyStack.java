package exercise;

/**
 * Name: Donghang He
 * Date: 2022/3/14 5:19 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public interface MyStack<Item> extends Iterable<Item> {

    MyStack<Item> push(Item item);

    Item pop() throws Exception;

    boolean isEmpty();

    int size();
}
