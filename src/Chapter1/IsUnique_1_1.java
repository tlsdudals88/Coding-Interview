package Chapter1;

import java.util.Arrays;

/**
 * Created by Youngmin on 2016. 5. 26..
 */


// Implement an algorithm to determine if a string has all unique characters.
// What if you cannot use additional data structure?

public class IsUnique_1_1 {

    public static void main(String[] args) {

        String str_unique = "abcdefghijk";
        String str_not_unique = "abdkcsjfd";

        System.out.println(isUnique1(str_unique));
        System.out.println(isUnique2(str_unique));
        System.out.println(isUnique3(str_unique));

        System.out.println(isUnique1(str_not_unique));
        System.out.println(isUnique2(str_not_unique));
        System.out.println(isUnique3(str_not_unique));

    }

    public static boolean isUnique1(String str) {
        // Brute Force: O(n2)

        for(int i=0; i<str.length(); i++) {
            for(int j=i+1; j<str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    return false;
            }
        }
        return true;
    }

    public static boolean isUnique2(String str) {
        // Sort: O(nlogn)

        // O(nlogn)
        char[] c = str.toCharArray();
        Arrays.sort(c);
        String sortStr = new String(c);

        // O(n)
        for(int i=1; i<sortStr.length(); i++) {
            if (sortStr.charAt(i - 1) == sortStr.charAt(i))
                return false;
        }
        return true;
    }

    public static boolean isUnique3(String str) {
        // Question? is the string a unicode or ASCII? ASCII: 256 bytes
        // O(n) possible!!
        if(str.length() > 256) // ASCII distinct value is at most 256
            return false;

        boolean[] char_set = new boolean[256]; // default value is false

        for(int i=0; i<str.length(); i++) {
            int num = str.charAt(i);

            if(char_set[num] == true) // Already found this char in string
                return false;

            char_set[num] = true;
        }

        return true;

    }
}
