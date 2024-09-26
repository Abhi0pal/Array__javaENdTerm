import java.util.*;

public class ReverseDLL {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; ++i) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int result = Arrays.binarySearch(nums, k);
        
  
        
        if (result>=0) {
            System.out.println("found"+result);
        }
        else{
            System.out.println("insert At: "+(-(result+1)));
        }


    }
    
}
