// Write a code for printing element which contains 9 in it.
// Input : Integer Array (10,15,8,49,25,98,91,32,15,987).
// Output : 49, 98, 91

import java.util.Arrays;

public class Contains_num {
    public static void main(String[] args) {
        int []arr={10,15,8,49,25,98,91,32,15,987};
        Arrays.stream(arr)
        .filter(num->String.valueOf(num).contains("9"))
        .forEach(System.out::println);
    }
}
