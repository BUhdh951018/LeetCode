package No190;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Stack;

/**
 * Name: Donghang He
 * Date: 2022/4/13 9:03 下午
 * Description:
 */
public class Bit_190 {
    public int reverseBits(int n) {
        Stack<Character> stack = new Stack<>();
        String temp = Integer.toBinaryString(n);
        while (temp.length() < 32) {
            temp = "0" + temp;
        }
        System.out.println(temp);
        for (char c : temp.toCharArray()) {
            stack.push(c);
        }
        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }
        return Integer.parseUnsignedInt(ans.toString(), 2);
    }
}
