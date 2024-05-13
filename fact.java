 public class fact{
    public static int calcfactorial(int n)
     {  
         if(n==1||n==0){
            return 1;
        }
        int facto=calcfactorial(n-1);
        int nu=n*facto;
        
         
    }
    public static void main(String args[]){
        int n=5;
        int ans=calcfactorial(n);
        System.out.println(ans);
    }
}
