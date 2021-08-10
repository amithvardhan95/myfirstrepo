import java.io.*;
class SearchIt
{
 
     public static void clearScreen() 
     {  
         System.out.print("\033[H\033[2J");  
         System.out.flush();  
         System.out.println("\n");
     }  

     public static String remove(String str,char rem)
     {
        int i=0;String ss="";
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)==rem)
            {ss+=" ";}
            else
            {ss+=str.charAt(i);}
        }
        return ss;
        
     }
  

     public static void main(String args[]) throws IOException
     {
         clearScreen();
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         int N;int i,j;String gg;char c;String str="";int M;char tt='\0';char d='\0';
         int k=0;int z=0;int y=0;boolean p=false;boolean q=false;
         while(true)
         {
              N=Integer.valueOf(br.readLine());
              if(N>=1 && N<=20)
              {break;}
              else
              {System.out.println("N must lie between 1 and 20 inclusive of both the limits. Press Enter key to input N once again.");
              gg=br.readLine();
              clearScreen();
              continue;
              }
              
         }
         String name[]=new String[N];
         for(i=0;i<N;i++)
         {
             gg=br.readLine();
             name[i]=gg.toUpperCase();
         }    

         
         while(true)
         {
              M=Integer.valueOf(br.readLine());
              if(M>=1 && M<=20)
              {break;}
              else
              {System.out.println("M must lie between 1 and 20 inclusive of both the limits. Press Enter key to input M once again.");
              gg=br.readLine();
              clearScreen();
              System.out.println(N);
              for(i=0;i<N;i++)
              {
                 System.out.println(name[i]);
              }  
              continue;
              }
              
         }

         
         while(true)
         {
         str=br.readLine();
         str=str.toUpperCase();
         if(str.length()==M)
         {
             break;              
         }
         else
         {
              System.out.println("String must be of length M. Press Enter key to input the string once again.");
              gg=br.readLine();
              clearScreen();
              System.out.println(N);
              for(i=0;i<N;i++)
              {
                 System.out.println(name[i]);
              }  
              System.out.println(M);
              continue;    
         }
         }
         


         

         while(true)
         {
         i=0;
         j=0;
         k=0;
         q=false;
         for(z=1;z<M;z++)
         {
         p=false;
         for(;i<N-1;i++) //Vertical
         {
             for(;j<N;j++)
             {
                  if(name[i+1].charAt(j)==str.charAt(k+1) )
                  {p=true;break;}
             }
             if(p)
             {name[i]=remove(name[i],name[i].charAt(j));i++;j=j;k++;break;}
         }
         if(p)
         {continue;}
         for(;i<N;i++) //Horizontal
         {
             for(;j<N-1;j++)
             {
                  if(name[i].charAt(j+1)==str.charAt(k+1) )
                  {p=true;break;}
             }
             if(p)
             {name[i]=remove(name[i],name[i].charAt(j));i=i;j++;k++;break;}
         }
         if(p)
         {continue;}
         for(;i<N-1;i++) //Diagonal
         {
             for(;j<N-1;j++)
             {
                  if(name[i+1].charAt(j+1)==str.charAt(k+1) )
                  {p=true;break;}
             }
             if(p)
             {name[i]=remove(name[i],name[i].charAt(j));i++;j++;k++;break;}
         }
         if(p)
         {continue;}
         
         }
         
         if((z-1)==k)
         {q=true;}
         if(q)
         {
             break;
         }
         }


         if(q)
         {System.out.println("\nYes\n");
         }        
         else
         {
            System.out.println("\nNo\n");
         }
         
    }
}
