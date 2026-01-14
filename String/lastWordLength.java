package String;
import java.util.*;
public class lastWordLength {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s=sc.nextLine();
        String[]words=s.trim().split(" ");
        System.out.println("The length of the last word in the string is "+words[words.length-1].length());
        sc.close();
    }
}
