//Leetcode 1704
package String;
import java.util.*;
public class alikeStrings {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s=sc.nextLine();
        String s1=s.toLowerCase();
        int len=s1.length();
        int count1=0,count2=0;
        for(int i=0;i<(len/2);i++)
        {
            if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u')
                count1++;
        }
        for(int i=(len/2);i<len;i++)
        {
            if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u')
                count2++;
        }
        if(count1==count2)
            System.out.println("Two halves of the string are alike");
        else
            System.out.println("Two halves of the string are not alike");
        sc.close();
    }
}
