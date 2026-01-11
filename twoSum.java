import java.util.*;
class Solution{
    public int[] getSum(int []arr, int target)
    {
        int[]a=new int[2];
        for(int i=0;i<arr.length;i++)
        {
            int j=i+1;
            while(j<arr.length)
            {
                if(arr[i]+arr[j]==target)
                {
                    a[0]=i;
                    a[1]=j;
                }
                j++;
            }
        }
        return a;
    }
}
class twoSum{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Solution s=new Solution();
        System.out.print("Enter the number of elements in the array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("Enter the target sum: ");
        int target=sc.nextInt();
        int b[]=s.getSum(a,target);
        for(int j:b)
        {
            System.out.print(j+" ");
        }
        sc.close();
    }
}