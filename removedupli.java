package recurssion;
public class removedupli{
    public static boolean[] map=new boolean[26];
    public static void removeduplicates (String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a']){
            removeduplicates(str,idx+1,newString);
        } else{
            newString+=currChar;
            map[currChar-'a']=true;
            removeduplicates(str,idx+1,newString);
        }
    }
    public static void main(String args[]){
        String str="aabbcd";
        removeduplicates(str,0,"");
    }
    
}
