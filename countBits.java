import java.util.*;
public class countBits {
    public static int[] countBits(int n) {
        int[] result = new int[n + 1];

        // Base case: number of 1's in binary representation of 0 is 0
        result[0] = 0;

        // Iterate over each number from 1 to n
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                result[i] = result[i / 2]; // Even case
            } else {
                result[i] = result[i / 2] + 1; // Odd case
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Input integer n

        int[] result = countBits(n);

        // Output the result array
        for (int i = 1; i <= n; i++) {
            System.out.print(result[i] + " ");
        }
    }

}
