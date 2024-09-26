import java.util.*;
public class Multiple_Six_Ten {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int y=30;
        int sum=0;
        HashSet<Integer>st=new HashSet<>();
        for(int i=0;i<=30;i=i+6){
            st.add(i);
            
        }
        for(int i=0;i<=30;i=i+10){
            st.add(i);
        }
        for(Integer i:st){
            sum+=i;
        }
        System.out.println(sum);





    }
    
}
