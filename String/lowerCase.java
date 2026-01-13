/*Given a string s, return the string after 
replacing every uppercase letter with the same lowercase letter. */

package String;
import java.util.Scanner;
public class lowerCase {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s=sc.nextLine();
        System.out.println("The resultant string is: "+s.toLowerCase());
        sc.close();
    }
}
