import java.io.*;
class report
{
     static int n=0;
     static double highscore1=0;
     static double highscore2=0;
     static double highscore3=0;
     static double highscore4=0;
     static double highscore5=0;
     static double lowscore1=0;
     static double lowscore2=0;
     static double lowscore3=0;
     static double lowscore4=0;
     static double lowscore5=0;
     static double avg1=0;
     static double avg2=0;
     static double avg3=0;
     static double avg4=0;
     static double avg5=0;


     static void clearScreen() 
     {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
    }  


     static double maximum(double arr[])
     {
         int i;
         double maxi=0;
         for(i=0;i<arr.length-1;i++)
         {
             if(arr[i]>arr[i+1])
                maxi=arr[i];
             else
                maxi=arr[i+1];
         }
         return maxi;
     }

     static double minimum(double arr[])
     {
         int i;
         double mini=0;
         for(i=0;i<arr.length-1;i++)
         {
             if(arr[i]>arr[i+1])
                mini=arr[i];
             else
                mini=arr[i+1];
         }
         return mini;
     }

     static double average(double arr[])
     {
         double su=0;
         double ar=0;
         int i;
         for(i=0;i<arr.length;i++)
             {su+=arr[i];}
         ar=su/arr.length;
         return ar;
     }
     

     static void accept() throws IOException
     {
         int i;
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.print("Enter the number of students      :   ");
         n=Integer.valueOf(br.readLine());
         static long rollnumber[]=new long[n];
         static double q1[]=new double[n];
         static double q2[]=new double[n];
         static double q3[]=new double[n];
         static double q4[]=new double[n];
         static double q5[]=new double[n];
         System.out.println("");
         System.out.println("");
         clearScreen();
         for(i=0;i<n;i++)
         {                        
             System.out.println("                 STUDENT "+(i+1)+"                 ");
             System.out.print("Enter your roll number       :    ");
             rollnumber[i]=Long.valueOf(br.readLine());
             System.out.println("");
             System.out.print("Marks in Quiz 1              :    ");
             q1[i]=Integer.valueOf(br.readLine());
             System.out.print("Marks in Quiz 2              :    ");
             q2[i]=Integer.valueOf(br.readLine());
             System.out.print("Marks in Quiz 3              :    ");
             q3[i]=Integer.valueOf(br.readLine());
             System.out.print("Marks in Quiz 4              :    ");
             q4[i]=Integer.valueOf(br.readLine());
             System.out.print("Marks in Quiz 5              :    ");
             q5[i]=Integer.valueOf(br.readLine());
             System.out.println("");
         }    
                

             
         highscore1=maximum(q1);
         highscore2=maximum(q2);
         highscore3=maximum(q3);
         highscore4=maximum(q4);
         highscore5=maximum(q5);
         lowscore1=minimum(q1);
         lowscore2=minimum(q2);
         lowscore3=minimum(q3);
         lowscore4=minimum(q4);
         lowscore5=minimum(q5);
         avg1=average(q1);
         avg2=average(q2);
         avg3=average(q3);
         avg4=average(q4);
         avg5=average(q5);

     }

     static void display()
     {
          int i;
          clearScreen();
          System.out.println("");
          System.out.println("");
          System.out.println("");
          System.out.println("      STUDENT       QUIZ 1       QUIZ 2       QUIZ 3       QUIZ 4       QUIZ 5      ");
          for(i=0;i<n;i++)
           {     System.out.println((rollnumber[i])+"     "+(q1[i])+"   "+(q2[i])+"     "+(q3[i])+"    "+(q4[i])+"    "+(q5[i])+"    ");}

          System.out.println("    High Score     "+(highscore1)+"     "+(highscore2)+"     "+(highscore3)+"     "+(highscore4)+"     "+(highscore5));
          System.out.println("    Low Score      "+(lowscore1)+"     "+(lowscore2)+"     "+(lowscore3)+"     "+(lowscore4)+"     "+(lowscore5));
          System.out.println("    Average        "+(avg1)+"     "+(avg2)+"     "+(avg3)+"     "+(avg4)+"     "+(avg5));
     }

     public static void main(String args[]) throws IOException
     {
         report.accept();
         report.display();

     }
}
