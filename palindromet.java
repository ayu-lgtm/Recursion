public class palindromet {
    public static boolean ispalindrome(String s,int low,int high){
        if(low>=high){
            return true;
        }
        return (s.charAt(low)==s.charAt(high) && ispalindrome(s, low+1, high-1));
    }
    public static void main(String args[]){
        String s="ABABA";

        System.out.print(ispalindrome(s,0,s.length()-1));
    }
}
