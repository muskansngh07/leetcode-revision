import java.util.*;
public class reverseWords {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s=sc.nextLine();
        String[]words=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String i:words)
        {
            sb.append(new StringBuilder(i).reverse().toString()+" ");
        }
        System.out.println("The result is: "+sb.toString());
        sc.close();
    }
}

