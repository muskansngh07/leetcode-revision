import java.util.*;
public class removeStars {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s=sc.nextLine();
        Stack<Character> sck=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(ch=='*' && !sck.isEmpty())
                sck.pop();
            else
                sck.push(ch);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<sck.size();i++)
        {
            sb.append(sck.get(i));
        }
        System.out.println("The resultant string is "+sb.toString());
        sc.close();
    }
}
