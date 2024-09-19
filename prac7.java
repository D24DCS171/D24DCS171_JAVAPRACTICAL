package part2;

public class prac7 {
    public static void main(String[]args){
        String s1="choclate";
        String copies=front(s1,3);
        System.out.println("string:"+copies);
        
    }
    static String front(String S,int n){
        
        String result="";
        String s2= S.substring(0, 3);
        for(int i=0;i<=n;i++){
        result=result+s2;}
        return result;
    }
    
}
