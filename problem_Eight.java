import java.util.Arrays;

public class problem_Eight {
    public static boolean binarySearch(int[][] arr, int target) {
        int row = arr.length;
        int col = arr[0].length;

        int left = 0;
        int right = row * col - 1;
        while (left <=right) {
            int mid = left + (right - left) / 2;
            int midElement = arr[mid / col][mid % col];
            if (midElement == target) {
                return true;
            } else if (midElement < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };

        System.out.print(binarySearch(arr, 3));
    }

}
