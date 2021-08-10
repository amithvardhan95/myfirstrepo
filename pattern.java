import java.io.*;
class pattern
{
    static void pattern1() throws IOException
    {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         int i,j,n;
         System.out.print("Enter the value of n      :   ");
         n=Integer.valueOf(br.readLine());
         for(i=n;i>=1;i--)
         {
              for(j=1;j<=i;j++)
              {System.out.print(j+" ");}
              for(j=1;j<=(n-i);j++)
              {System.out.print(j+" ");}
              System.out.println("");
         }
    }
    static void pattern2() throws IOException
    {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         int i,j,n;
         System.out.print("Enter the value of n      :   ");
         n=Integer.valueOf(br.readLine());
         for(i=n;i>=1;i--)
         {
              for(j=1;j<=i;j++)
              {System.out.print(j+" ");}
              for(j=1;j<=(n-i);j++)
              {System.out.print(i+" ");}
              System.out.println("");
         }
    }
    static void pattern3() throws IOException
    {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         int i,j,n;
         System.out.print("Enter the value of n      :   ");
         n=Integer.valueOf(br.readLine());
         for(i=1;i<=n;i++)
         {
              for(j=1;j<=i;j++)
              {System.out.print(j+" ");}
              for(j=1;j<=(n-i);j++)
              {System.out.print(i+" ");}
              System.out.println("");
         }
    }
    public static void main(String args[]) throws IOException
    {
         pattern pt=new pattern();
         pt.pattern3();
    }
}
