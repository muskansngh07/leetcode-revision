/* You are given a string s. 
The score of a string is defined as the 
sum of the absolute difference between the ASCII values of adjacent characters.
Return the score of s. */

package String;
import java.util.*;
public class scoreString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s=sc.nextLine();
        int sum=0,i=0,j=1;
        while(i<s.length() && j<s.length()){
            int a1=(int)s.charAt(i);
            int a2=(int)s.charAt(j);
            sum=sum+(Math.abs(a1-a2));
            i++;
            j++;
        }
        System.out.println("The absolute difference between ASCII values of adjacent characters in the string is "+sum);
        sc.close();
    }
}
