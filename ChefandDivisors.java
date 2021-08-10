import java.io.*;
class ChefandDivisors
{
    boolean testcaseconstraint(long t)
    {
        if(t>=1 && t<=50)
        return true;
        else
        return false;
    }

    boolean numberconstraint(long n)
    {

        if(n>=2 && n<=Math.pow(10,18))
        return true;
        else
        return false;

    
    }

    boolean primefactorconstraint(long pf)
    {
         if(pf>=2 && pf<=Math.pow(10,6))
         return true;
         else
         return false;
    }


    public static void main(String args[]) throws IOException
    {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         long tc;int i;String hh;int num=0;
         System.out.print("Enter the number of test cases     :   ");
         while(true)
         {
         tc=Long.valueOf(br.readLine());
         if(!testcaseconstraint(tc))
         {
             System.out.println("No of test cases must be >=1 and <=50. Press Enter to input no of test cases once again.");
             hh=br.readLine();
             continue;   
         }
         else
         {break;}
         }
         System.out.println("");
         for(i=1;i<=tc;i++)
         {
              System.out.println("                 TEST CASE"+(i+1)+"                 \n");
              System.out.print("Enter the number         :    ");
              
         }
    }
}
