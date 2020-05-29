import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
      	String s = in.nextLine();
      	int arr[] = new int[26];
        s = s.toLowerCase();
        int l = s.length();
        int i,j;
        for(i = 0; i < 26; i++)
          arr[i]=0;
        for(i = 0; i < l; i++)
        {
          int f = s.charAt(i)-'a';
          arr[f]++;
        }
        String s1="";
       // s=s.unique();
        for(i=0;i<l;i++)
        {
          int flag=0;
          for(j=0;j<s1.length();j++)
          {
            if(s1.charAt(j)==s.charAt(i))
              flag=1;
          }
          if(flag==0)
          s1=s1+s.charAt(i)+arr[s.charAt(i)-'a']+' ';
         
          
        }
      System.out.print(s1);
    }
}