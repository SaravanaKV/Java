public class Recursion{
    public static void main(String[] args) {
        int s=1;
        add(5,s);
    }
    public static void add(int n,int s){
        if(n==0){
            System.out.println(s);
        }
        else {
            s*=n;
            add(n-1,s);
        }

    }

}