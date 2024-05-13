package recurssion;

public class tiles{
    public static int Tiles(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        
        int horizontal=Tiles(n-1,m);
        int vertical=Tiles(n-m,m);
        return horizontal+vertical;
        
    }
    public static void main(String args[]){
        int n=3,m=2;
   
        System.out.println(Tiles(n,m));
    }
}
