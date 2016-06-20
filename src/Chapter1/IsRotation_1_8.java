package Chapter1;

/**
 * Created by Youngmin on 2016. 6. 20..
 */


// Assume you have a method isSubstring which checks if one word is a substring of another.
// Given two string, s1 and s2, write code to check if S2 is a rotation of s1 using only on call to isSubstring
// ex) "waterbottle" is a rotation of "erbottlewat"
public class IsRotation_1_8 {
    public static void main(String[] args) {

        String str1 = "apple";
        String str2 = "pplea";
        String str3 = "pleap";
        String str4 = "leapp";
        String str5 = "eappl";
        String str6 = "eappa";
        String str7 = "eapple";

        System.out.println(isRotation(str1,str2));
        System.out.println(isRotation(str1,str3));
        System.out.println(isRotation(str1,str4));
        System.out.println(isRotation(str1,str5));
        System.out.println(isRotation(str1,str6));
        System.out.println(isRotation(str1,str7));

    }

    public static boolean isRotation(String str1, String str2) {

        String str1str1 = str1 + str1; // appleapple

        if(str1.length() == str2.length() && str1str1.contains(str2))
            return true;
        else
            return false;
    }
}
