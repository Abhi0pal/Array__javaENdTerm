public class Max_prod {
    public static void main(String[] args) {
        int[] arr = {2 ,3 ,-2 ,4};
        int maxi=0;
        for(int i=0;i<arr.length;i++){
            int curr=1;
            for(int j=i;j<arr.length;j++){
                curr*=arr[j];
                maxi=Math.max(maxi,curr);
            }
        }
        System.out.println(maxi);
    }
    
}
