package recurssion;
public class Subsequences{
    public static void subsequences(String str, int idx,String newstring){
        if(idx==str.length()){
            System.out.println(newstring);
            return;
        }
        char currchar=str.charAt(idx);
        subsequences(str,idx+1,newstring+currchar);
        subsequences(str,idx+1,newstring);
    }
    public static void main(String args[]){
        String str="abc";
        subsequences(str,0,"");
    }
}
