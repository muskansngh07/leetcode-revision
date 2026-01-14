package String;
import java.util.*;
class Solution {
    public String reversePrefix(String word, char ch) 
    {
        if(word.indexOf(ch)==-1)
            return word;
        int first=word.indexOf(ch);
        String x=word.substring(0,first+1);
        StringBuilder sb=new StringBuilder(x);
        sb.reverse();
        return sb.toString()+word.substring(first+1);

    }
}
public class reversePrefix {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Solution n=new Solution();
        System.out.print("Enter a string: ");
        String s=sc.nextLine();
        System.out.print("Enter a character: ");
        char ch=sc.next().charAt(0);
        System.out.println("The reverse of the prefix is "+n.reversePrefix(s, ch));
        sc.close();
    }
}
