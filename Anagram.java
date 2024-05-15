// Given 2 Strings, you need to Check whether the Strings are angram or not,
// One String is called anagram of another String if it has the exact same characters as the original String, but it can be in different orders

// Examples:  
// Str1 = LISTEN , Str2 = SILENT, output = true 
// Str1 = INTEGRAL, Str2 = TRIANGLE, OUTPUT = true 
// Str1 = Walmart, Str2 = IndiaMart, Output = false'

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "LISTEN";
        String s2 = "SILENT";
        System.out.println("are the string anagram " + areAnagram(s1, s2));
    }

    public static boolean areAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
       return Arrays.equals(s1.chars().sorted().toArray(), s2.chars().sorted().toArray());
    }
}
