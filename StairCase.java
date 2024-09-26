import java.util.*;
public class StairCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int coins=5;
        int step=0;
        int curr_Step=1;
        while(coins>0){
            coins=coins-curr_Step;
            step++;
            curr_Step++;
        }
        System.out.println(step-15);
    }
    
}
