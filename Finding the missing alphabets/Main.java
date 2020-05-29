import java.util.Scanner;
class Main{
    public static void main(String args[]){
     Scanner in = new Scanner(System.in);
      	String s = in.nextLine();
      	int arr[] = new int[27];
        s = s.toLowerCase();
        int l = s.length();
        int i,j;
        for(i = 0; i < 26; i++)
          arr[i]=0;
        for(i = 0; i < l; i++)
        {
          if(s.charAt(i)!=' '){
          int f = s.charAt(i)-'a';
          arr[f]++;
          }
        }
        for(i=0;i<26;i++)
        {
          if(arr[i]==0)
          {
            char cc;
            cc=(char)('a'+i);
            System.out.print(cc);
            System.out.print(' ');
          }
        }
      

    }
}