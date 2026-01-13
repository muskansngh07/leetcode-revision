package String;
import java.util.*;
public class reverseCharArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of character array: ");
        int n=sc.nextInt();
        char []ch=new char[n];
        System.out.print("Enter the array elements:\n");
        for(int i=0;i<n;i++){
            ch[i]=sc.next().charAt(0);
        }
        int j=0,k=n-1;
        while(j<k){
            char temp=ch[j];
            ch[j]=ch[k];
            ch[k]=temp;
            j++;
            k--;
        }
        System.out.print("The reversed array is: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(ch[i]+" ");
        }
        sc.close();
    }
}
