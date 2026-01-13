package bit_manipulation;
import java.util.*;
class Solution{
    public int numberBits(int n)
    {
        int count=0;
        while(n!=0)
        {
            if(n%2==1) count++;
            n/=2;
        }
        return count;
    }
}
class setBits
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Solution s=new Solution();
        System.out.print("Enter a number, you want to count the set bits for: ");
        int num=sc.nextInt();
        sc.nextLine();
        int result=s.numberBits(num);
        System.out.println("The number of set bits in "+num+" is "+result);
        sc.close();
    }
}