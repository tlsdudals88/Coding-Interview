/**
 * Created by Youngmin on 2016. 6. 14..
 */

// Write a method to replace all spaces in a string with '%20'.
// You may assume that the string has sufficient space at the end of the string to hold the additional characters
// and that you are given the "true" length of the string.
// Note if implementing in Java, please use a character array so that you can perform this operation in place.

public class ReplaceSpace_1_4 {

    public static void main(String[] args) {

        String str = "My name is Youngmin Shin.";

        System.out.println(replaceSpace(str));

    }

    public static char[] replaceSpace(String str) {

        //////// Important! how to fit the char buffer => count space! ////////
        int space = 0;
        int length = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == ' ')
                space++;
        }
        length = str.length() + 2*space;
        char[] result = new char[length];
        ///////////////////////////////////////////////////////////////////////

        char[] strTochar = str.toCharArray();

        int j = 0;
        for(int i=0; i<strTochar.length; i++) {

            result[j] = strTochar[i];

            if(strTochar[i] == ' ') {
                result[j] = '%';
                result[j+1] = '2';
                result[j+2] = '0';

                j = j+3;
            }
            else {
                j = j+1;
            }

        }

        return result;
    }

}
