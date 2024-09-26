import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * ArrayPrac
 */
public class ArrayPrac {
    public static void kSum(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            if (arr[low] + arr[high] > k) {
                high--;
            } else if (arr[low] + arr[high] < k) {
                low++;
            } else {
                System.out.println("Pair with sum " + k + " is " + arr[low] + " " + arr[high]);
                low++;
                high--;
            }

        }
    }

    public static void threeArraySum(int[] arr, int[] arr1, int[] arr2) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if (arr[i] == arr1[j] && arr1[j] == arr2[k]) {
                        System.out.println(arr[i]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        // int[] arr={1,2,3,4,5,6};
        // int k=9;
        // kSum(arr,k);

        // int[] arr={1,2,3,4,5,6};
        // int[] arr1={1,2};
        // int[] ar2={1,2,3,4,5,6};
        // threeArraySum(arr,arr1,ar2);

        // int[] arr={0,1,0,0,0,1,1,0,1,1,0,0};
        
//         Arrays.sort(arr);
//         System.out.println(arr);
//         for(Integer i:arr){
//             System.out.println(i);
// 
//         }

    int[] arr={2,5,3,1,8,7,5,3,2};
    HashMap<Integer,Integer>mpp=new HashMap<>();
    for(int i=0;i<arr.length;i++){
        if(mpp.containsKey(arr[i])){
            mpp.put(arr[i],mpp.get(arr[i])+1);
        }
        else{
            mpp.put(arr[i],1);
        }

    }
    
    for(Map.Entry<Integer,Integer> i:mpp.entrySet()){
        if(i.getValue()>1){
            System.out.println(i.getKey());

        }

    }
        
        
    }
}