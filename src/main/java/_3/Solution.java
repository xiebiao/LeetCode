package _3;

/**
 * <pre>
 *     1. 遍历字符数组
 *          1.当前字符与前面所有字符比较
 *              如果不相同,则temp+1
 *              如果相同,将当前字符的下标记录flag=当前字符下标+1，同时比较longest与temp的大小
 * </pre>
 *
 * @author xiebiao
 * @date 7/29/16
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int flag = 0, longest = 1, temp = 1;
        char[] chars = s.toCharArray();
        if (chars.length == 0) {
            return 0;
        }
        for (int i = 1; i < chars.length; i++) {
            for (int j = i - 1; j >= flag; j--) {
                if (chars[j] != chars[i]) {
                    temp = temp + 1;
                } else {
                    flag = j + 1;
                    break;
                }
            }
            if (longest < temp) {
                longest = temp;
            }
            temp = 1;
        }
        return longest;
    }
}
