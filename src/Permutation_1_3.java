import java.util.Arrays;

/**
 * Created by Youngmin on 2016. 6. 14..
 */

// Given two String, write a method to decide if one is a permutation of the other

/*
    Anagram is "a word or phrase spelled by rearranging the letters of another word or phrase".
    So to be an anagram the arrangement of letters must make a word
    - that is, an anagram of a word must have a meaning.

    On the other hand, permutation is defined as
    "the act of changing the arrangement of a given number of elements".
    So a permutation of a word can be any random assortment of characters,
    not necessarily having a meaning in the original language.
*/

public class Permutation_1_3 {
    public static void main(String[] args) {

        String str1="yooung";
        String str2="nuoygo";

        System.out.println(permutation1(str1, str2));
        System.out.println(permutation2(str1, str2));
    }

    public static boolean permutation1(String str1, String str2) {
        // Sort O(nlogn)

        if(str1.length() != str2.length())
            return false;

        char[] strTochar1 = str1.toCharArray();
        char[] strTochar2 = str2.toCharArray();

        Arrays.sort(strTochar1); // O(nlogn)
        Arrays.sort(strTochar2); // O(nlogn)

        String new_str1 = new String(strTochar1);
        String new_str2 = new String(strTochar2);

        if(new_str1.equals(new_str2)) // O(n)
            return true;

        return false;
    }

    public static boolean permutation2(String str1, String str2) {
        // Assume that string is a ASCII => O(n)

        if(str1.length() != str2.length())
            return false;

        int[] num1 = new int[256];
        int[] num2 = new int[256];

        for(int i=0; i<str1.length(); i++) {
            int temp = str1.charAt(i);
            num1[temp]++;
            // System.out.println(temp);
        }

        for(int i=0; i<str2.length(); i++) {
            int temp = str2.charAt(i);
            num2[temp]++;
            // System.out.println(temp);
        }

        for(int i=0; i<256; i++) {
            if(num1[i] != num2[i])
                return false;
        }

        return true;

    }

}
