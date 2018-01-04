// This solution is without using split,trim or string buffer or any other built-in function

public class Solution {
   public static void reverse(char[] arr, int start, int end) {
    while (end > start) {
        char tmp = arr[start];
        arr[start++] = arr[end];
        arr[end--] = tmp;
    }
}

public static int cleanSpaces(String s, char[] charArr) {
    boolean inWord = false;
    int pos = 0;
    for (int i = 0; i < s.length(); ++i) {
        char c = s.charAt(i);
        if (c == ' ') {
            if (inWord) {
                charArr[pos++] = ' ';
                inWord = false;
            }
        } else {
            inWord = true;
            charArr[pos++] = c;
        }
    }
    return pos == 0 || charArr[pos - 1] != ' ' ? pos : pos - 1;
}

public static String reverseWords(String s) {
    char[] charArr = new char[s.length()];
    int n = cleanSpaces(s, charArr);
    reverse(charArr, 0, n - 1);
    int last = -1;
    for (int i = 0; i < n; ++i) {
        if (charArr[i] == ' ') {
           reverse(charArr, last + 1, i - 1);
           last = i;
        }
    }
    reverse(charArr, last + 1, n - 1);
    return new String(charArr, 0, n);
}

}
