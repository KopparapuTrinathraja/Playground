import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    
    int arr1[][] = new int[r][c];
    int arr2[][] = new int[r][c];
    int sub[][] = new int[r][c];
    
    int i,j;
    for(i = 0; i < r; i++)
    {
      for(j = 0; j < c; j++)
      {
        arr1[i][j] = in.nextInt();
      }
    }
    
    for(i = 0; i < r; i++)
    {
      for(j = 0; j < c; j++)
      {
        arr2[i][j] = in.nextInt();
      }
    }
    
    for(i = 0; i < r; i++)
    {
      for(j = 0; j < c; j++)
      {
        sub[i][j] = arr1[i][j]-arr2[i][j];
      }
    }
    for(i = 0; i < r; i++)
    {
      for(j = 0; j < c; j++)
      {
        System.out.print(sub[i][j]+" ");
      }
      System.out.print("\n");
    }
    
    
  }
}