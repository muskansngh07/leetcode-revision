package Array;
import java.util.Scanner;
public class binarySearch {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.print("Enter the size of array: \n");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("Enter the element to be searched: ");
        int target=sc.nextInt();
        int low=0,high=n-1,count=0;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(target==a[mid])
            {
                System.out.println(target+" found at index "+mid);
                count++;
                break;
            }
            else if(target>a[mid])
                low=mid+1;
            else
                high=mid-1;
        }
        if(count==0)
            System.out.println(target+" not found.");
        sc.close();
    }
}

// Time Complexity: O(log n) where n is the number of elements in the array.