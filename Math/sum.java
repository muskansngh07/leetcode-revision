package Math;
import java.util.*;
class Solution{
    public int getSum(int a, int b)
    {
        return (b==0)?a:getSum(a^b,(a&b)<<1);
    }
}
public class sum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Solution s=new Solution();
        System.out.print("enter the first number: ");
        int a=sc.nextInt();
        System.out.print("enter the second number: ");
        int b=sc.nextInt();
        int result=s.getSum(a,b);
        System.out.println("The result is "+result);
        sc.close();
    }
}
