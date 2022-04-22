package No476;

/**
 * Name: Donghang He
 * Date: 2022/4/21 7:38 下午
 * Description:
 */
public class Bit_476 {
    public int findComplement(int num) {
        String temp = Integer.toBinaryString(num);
        StringBuilder res = new StringBuilder();
        for (char c : temp.toCharArray()) {
            if (c == '0')
                res.append('1');
            else
                res.append('0');
        }

        return Integer.parseInt(res.toString(), 2);
    }
}
