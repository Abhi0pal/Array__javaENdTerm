public class Sub_Ech_digit {
    public static int rev(int n){
        int rev_num = 0;
        while (n!=0) {
            int digit=n%10;
            rev_num=rev_num*10+digit;
            n/=10;
        }
        return rev_num;

    }
    public static void main(String[] args) {
        int n=3456;
        int temp=n;
        int number=0;
        while (temp!=0) {
            int digit=temp%10;
            digit=digit-1;
            number=number*10+digit;
            temp/=10;
        }
        System.out.println("This is Original number"+n);
        System.out.println(rev(number));

    }
    
}
