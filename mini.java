import java.io.*;
class mini
{
     public static void main(String args[]) throws IOException
     {
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           String num;char c;int i,l;boolean p=true;
           System.out.print("Enter a number      :   ");
           num=br.readLine();
           l=num.length();
           for(i=0;i<l;i++)
           {
               c=num.charAt(i);
               if(Character.isDigit(c) || c=='.')
               {p=true;}
               else
               {p=false;}
           }
           if(p)
           {System.out.println(num+" is a number");}
           else
           {System.out.println(num+" is not a number");}
     }
}
