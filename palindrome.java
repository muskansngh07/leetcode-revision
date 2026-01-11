import java.util.*;
class Solution{
    public boolean checkPalindrome(int a)
    {
        int temp=a;
        int reverse=0;
        while(a!=0)
        {
            reverse=reverse*10+(a%10);
            a/=10;
        }
        return (reverse==temp);
    }
}
public class palindrome {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Solution s=new Solution();
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        if(s.checkPalindrome(num))
            System.out.println(num+" is a Palindrome Number.");
        else
            System.out.println(num+" is not a Palindrome Number.");
        sc.close();
    }
}
