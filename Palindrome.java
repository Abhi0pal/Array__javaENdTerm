public class Palindrome {
    public static void main(String[] args) {
        // String str="not a racecar hero radar level";
        // for(String i:str.split(" ")){
        //     StringBuilder sb=new StringBuilder(i);
        //     if(i.equals(sb.reverse().toString())){
        //         System.out.println(i);
        //         break;
        //     }
        // }

        String str="Abhishek Pal is Good Boy";
        String[] st=str.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=st.length-1;i>=0;i--){
            sb.append(st[i]);
            if(i!=0){
                sb.append(" ");

            }
        }
        System.out.println(sb.toString());
    }
    
}
