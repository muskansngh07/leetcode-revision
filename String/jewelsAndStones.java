// Leetcode 771
package String;
import java.util.*;
public class jewelsAndStones {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the jewels: ");
        String jewels=sc.nextLine();
        System.out.print("Enter the stones: ");
        String stones=sc.nextLine();
        int count=0;
        for(int i=0;i<stones.length();i++){
            if(jewels.indexOf(stones.charAt(i))!=-1)
                    count++;
        }
        if(count==1)
        {
            System.out.println(count+" stone is also a jewel.");
        }
        else
            System.out.println(count+" stones are also jewels.");
        sc.close();
    }
}
