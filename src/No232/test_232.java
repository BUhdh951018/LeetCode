package No232;

/**
 * Name: Donghang He
 * Date: 2022/3/14 5:55 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class test_232 {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        System.out.println(myQueue.peek()); // return 1
        myQueue.pop(); // return 1, queue is [2]
        myQueue.empty(); // return false
        myQueue.push(1);
        System.out.println(myQueue.peek());
    }
}
