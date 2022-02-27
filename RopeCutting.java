

public class RopeCutting {
    //maximum number of piece
    public static int ropeCutting(int l,int a,int b,int c){
        if(l==0)return 0;
        if(l<0)return -1;
        else{
            int res=Math.max(ropeCutting(l-a, a, b, c),ropeCutting(l-b, a, b, c));
            res=Math.max(res,ropeCutting(l-c, a, b, c));
            if(res==-1){
                return -1;
            }
            return res+1;
        }
        
    }
    public static void main(String args[]){
        int rope_len=10;
        int part1=3,part2=2,part3=5;

        System.out.print(ropeCutting(rope_len,part1,part2,part3));
    }
}
