public class TowerOfHanoi {
    //3 rods
    public static void Toh(int n,char a,char b,char c){
        if(n==1){
            System.out.println("1 move from A to C");
            return;
        }
        Toh(n-1,a,c,b);
        System.out.println(n+" move from "+ a +" to "+ c);
        Toh(n-1,b,a,c);
    }

    //4rods
    public static void Toh1(int n,char a,char b,char c,char d){
        if(n==0){
            return;
        }
        if(n==1){
            System.out.println(n+" move from "+ a +" to "+ b);
            return;
        }
        Toh1(n-2,a,b,d,c);
        System.out.println(n-1+" move from "+ a +" to "+ d);
        System.out.println(n+" move from "+ a +" to "+ b);
        System.out.println(n-1+" move from "+ d +" to "+ b);
        Toh1(n-2,b,c,a,d);
    }

    public static void main(String args[]){
        //Toh(3,'A','B','C');
        Toh1(4,'A','B','C','D');
    }
}
