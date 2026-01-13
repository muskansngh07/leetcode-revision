import java.util.*;
class Solution{
    public boolean checkAnagram(String s, String t)
    {
        if(s.length()!=t.length()) return false;
        Map<Character, Integer> a=new HashMap<>();
        Map<Character, Integer> b=new HashMap<>();
        for(char ch:s.toCharArray()){
            a.put(ch,a.getOrDefault(ch,0)+1);
        }
        for(char ch:t.toCharArray()){
            b.put(ch,b.getOrDefault(ch,0)+1);
        }
        if(a.equals(b))
            return true;
        return false;
    }
}
class validAnagram{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Solution s=new Solution();
        System.out.print("Enter the first string: ");
        String a=sc.nextLine();
        System.out.print("Enter the secomd string: ");
        String b=sc.nextLine();
        if(s.checkAnagram(a, b))
            System.out.println(b+" is an anagram of "+a);
        else    
            System.out.println(b+" is not an anagram of "+a);
        sc.close();

    }
}