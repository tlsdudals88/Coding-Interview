package Chapter1;

/**
 * Created by Youngmin on 2016. 6. 20..
 */

// Implement a method to perform basic string compression using the counts of the repeated characters.
// For example, the string aabcccccaaa would become a2b1c5a3.
// If the "compressed" string would not become smaller than the original string, your method should return
// original string
    

public class CompressedString_1_5 {
    public static void main(String[] args) {

        String str1 = "aaabcccccaaa";
        String str2 = "abcdee";

        System.out.println(CompressedString1(str1));
        System.out.println(CompressedString1(str2));
    }

    public static String CompressedString1(String str) {

        // O(n)

        String result_str = "";
        int count = 1;
        char temp;
        temp = str.charAt(0);

        for(int i=1; i<str.length(); i++) {

            if(temp == str.charAt(i))
            {
                count++;
            }
            else
            {
                result_str = result_str + temp + Integer.toString(count);
                temp = str.charAt(i); // update temp
                count = 1; // initialize count to 1
            }
        }

        // String length check => O(n)
        String original_str = str;
        String new_str = result_str + temp + Integer.toString(count);

        if(original_str.length() < new_str.length())
            return original_str;
        else
            return new_str;
    }
}

