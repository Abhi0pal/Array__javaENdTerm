import java.util.*;
public class validBRacket {
    public static void main(String[] args) {
        String str="[[[]]][][]";
        int Count=0;
        int maxii=0;

        for(char ch:str.toCharArray()){
            if(ch=='['){
                Count++;
            }
            else{
                //  ]
                Count--;
            }
            maxii=Math.max(maxii,-Count);
        }
        System.out.println(maxii+1/2);
        
    }
    
}
