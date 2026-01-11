import java.util.*;
public class reverseOrderWords {
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        String [] x=s.split(" ");
        for(int i=x.length-1;i>=0;i--)
        {
            if(x[i].equals(""))
                sb.append("");
            else
                sb.append(x[i].trim()+" ");
        }
        System.out.println("The resultant string is: "+sb.toString().trim());
        sc.close();
    }
}
