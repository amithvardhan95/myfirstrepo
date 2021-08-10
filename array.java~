import java.io.*;
class array
{
     static void clearScreen() 
     {  
          System.out.print("\033[H\033[2J");  
          System.out.flush();  
     }  
     public static void main(String args[]) throws IOException
     {
          clearScreen();
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("");
          System.out.print("Enter the number of elements     :   ");
          int n;
          n=Integer.valueOf(br.readLine());
          int j,k,i;int h=0;int p=0;
          int a[]=new int[n];
          System.out.println("");
          for(i=0;i<n;i++)
          {
              System.out.print("Enter element "+(i+1)+"         :    ");
              a[i]=Integer.valueOf(br.readLine());
          }
          System.out.println("\n");
          System.out.print("Enter the no of rows         :   ");
          j=Integer.valueOf(br.readLine());
          System.out.print("Enter the no of columns      :   ");
          k=Integer.valueOf(br.readLine());
          int arr[][]=new int[j][k];

          if(n!=j*k)
          {System.out.println("\n\nInvalid Combination\n");
          System.exit(0);}
          
          for(i=0;i<j;i++)
          {
              for(p=0;p<k;p++)
              {
                  if(h<n)
                  {arr[i][p]=a[h];h++;}
                  else
                  {arr[i][p]=0;}
              }
          }
          clearScreen();
          System.out.println("\n");
          for(i=0;i<j;i++)
          {
              for(p=0;p<k;p++)
              {
                  System.out.print(arr[i][p]+"  ");
              }
              System.out.println("");       
          }
          System.out.println("\n\n");
     }
}
