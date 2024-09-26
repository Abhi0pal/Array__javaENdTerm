public class fib {
    public static int fibnaci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibnaci(n-2)+fibnaci(n-1);
    }
    public static void series(int n){
        for(int i=0;i<=n;i++){
            System.out.println(fibnaci(i)+" ");
        }
    

    }

    public static void main(String[] args) {
        series(7);
        
    }
    
}
