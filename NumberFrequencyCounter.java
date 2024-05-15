public class NumberFrequencyCounter {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 2, 1, 3, 5, 4, 5, 6, 7, 8, 9, 9, 7, 6, 8};

        // Find the maximum number in the array to determine the size of the frequency array
        int maxNumber = findMax(numbers);

        // Create an array to store number frequencies
        int[] frequencyArray = new int[maxNumber + 1];
        // Count the frequency of each number
        for (int number : numbers) {
            frequencyArray[number]++;
        }

        // Print the results
        for (int i = 1; i < frequencyArray.length; i++) {
            if (frequencyArray[i] > 0) {
                System.out.println("Number " + i + " occurs " + frequencyArray[i] + " times.");
            }
        }
    }

    // Helper method to find the maximum number in an array
    private static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
