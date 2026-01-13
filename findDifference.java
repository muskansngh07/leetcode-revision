import java.util.*;
// this is one way i solved this problem 
class Solution 
{
    public char findTheDifference(String s, String t) 
    {
           int sum1=0,sum2=0,i=0,j=0;
           while(i<s.length())
           {
            int x=(int)s.charAt(i);
            sum1+=x;
            i++;
           }
           while(j<t.length())
           {
            int y=(int)t.charAt(j);
            sum2+=y;
            j++;
           }
           return (char)(sum2-sum1);
     }
}
public class findDifference {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Solution n=new Solution();
        System.out.print("Enter the first string: ");
        String s=sc.nextLine();
        System.out.print("Enter the second string: ");
        String t=sc.nextLine();
        System.out.println("The difference between both the strings is: "+ n.findTheDifference(s,t));
        sc.close();
    }
}
