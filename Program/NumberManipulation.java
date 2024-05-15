public class NumberManipulation {
    private static final int[] numbers = {16, 28, 39, 47, 55};
    public static void main(String[] args) {
        
        long result = manipulateNumbers();
        System.out.println("Result: " + result);
    }

    public static long manipulateNumbers() {
        long sum=0;
        for (int num : numbers) {
            sum += num;
        }

        // Continue until we get a single-digit number
        while (sum >= 10) {
            int product = 1;
            // Multiply the digits of the sum
            while (sum > 0) {
                long digit = sum % 10;
                product *= digit;
                sum /= 10;
            }
            sum = product;
        }
        return sum;
    }
}
