/**
 * Created by Youngmin on 2016. 6. 14..
 */

// Implement a function void reverse(String str)
public class ReverseStr_1_2 {
    public static void main(String[] args) {

        String str = "abcde";
        reverse(str);
    }

    public static void reverse(String str) {

        // O(n)

        char temp;
        char[] strTochar = str.toCharArray();

        for(int i=0; i<str.length()/2; i++) {

            temp = strTochar[strTochar.length - 1 - i];
            strTochar[strTochar.length - 1 - i] = strTochar[i];
            strTochar[i] = temp;
        }

        String reverseStr = new String(strTochar);

        System.out.println(reverseStr);

    }
}
