//Leetcode 1544
import java.util.*;
public class makeStringGreat {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Stack<Character> sck=new Stack<>();
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(!sck.isEmpty() && Math.abs(str.charAt(i)-sck.peek())==32)
                sck.pop();
            else
                sck.push(str.charAt(i));
        }
        StringBuilder sb=new StringBuilder();
        for(int j=0;j<sck.size();j++){
            sb.append(sck.get(j));
        }
        System.out.println("The resultant string is: "+sb.toString());
        sc.close();
    }
}
