import java.util.*;
public class Main {
    static int val(int a,int b)
    {
        return a+b;
    }

    static int val2(int data)
    {
        return data*5;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b;
        int val = Main.val(6,54);
        a=Main.val2(5);
        b=35;
        val/=a+b;
        System.out.println(val);
    }
}