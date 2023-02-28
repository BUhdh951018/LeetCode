package No394;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Name: Donghang He
 * Date: 2023/2/27 3:59 下午
 * Description:
 */
public class Stack_394 {
    private int ptr;
    public String decodeString(String s) {
        if (s.length() == 1 && Character.isDigit(s.charAt(0)))
            return "";
        LinkedList<String> list = new LinkedList<>();
        ptr = 0;

        while (ptr < s.length()) {
            char c = s.charAt(ptr);
            if (Character.isDigit(c)) {
                String digit = getDigit(s);
                list.add(digit);
            } else if (Character.isLetter(c) || c == '[') {
                list.add(String.valueOf(c));
                ptr++;
            } else {
                ptr++;
                LinkedList<String> temp = new LinkedList<>();
                while (!"[".equals(list.peekLast())) {
                    temp.add(list.removeLast());
                }
                Collections.reverse(temp);
                list.removeLast();
                int number = Integer.parseInt(list.removeLast());
                StringBuffer sb1 = new StringBuffer();
                String sub = getString(temp);
                while (number-- > 0){
                    sb1.append(sub);
                }

                list.add(sb1.toString());
            }

        }

        return getString(list);
    }

    private String getString(LinkedList<String> temp) {
        StringBuffer sb = new StringBuffer();
        while (!temp.isEmpty()) {
            sb.append(temp.removeFirst());
        }
        return sb.toString();
    }

    private String getDigit(String s) {
        StringBuffer sb = new StringBuffer();
        while (Character.isDigit(s.charAt(ptr))) {
            sb.append(s.charAt(ptr++));
        }
        return sb.toString();
    }
}
