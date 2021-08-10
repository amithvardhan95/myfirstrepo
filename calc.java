import java.io.*;

class Calculator
{
    static int a,b,c;
    static int i;
    static double d;
    void print() throws IOException
    {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.print("\033[H\033[2J"); 
        System.out.flush();
        System.out.println("          CALCULATOR        ");
        System.out.println("");
        System.out.println("  OPTION            CHOICE  ");
        System.out.println("    +                  1    ");
        System.out.println("    -                  2    ");
        System.out.println("    *                  3    ");
        System.out.println("    /                  4    ");
        System.out.println("    %                  5    ");
        System.out.println("");
        System.out.println("");
    }
    
    void input() throws IOException
    {
        
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.print("Select the choice above         :   ");
        c=Integer.valueOf(br.readLine());
        if(c>=1 && c<=5)
        {
            System.out.print("Enter first number              :   ");
            a=Integer.valueOf(br.readLine());
            System.out.print("Enter second number             :   ");
            b=Integer.valueOf(br.readLine());
        }
        System.out.println("");
        System.out.println("");
    }
    
    void select() throws IOException
    {
       
       switch(c)
       {
           case 1: i=a+b;
                   System.out.println("Answer        :   "+i);
                   break;
           case 2: i=a-b;
                   System.out.println("Answer        :   "+i);
                   break;
           case 3: i=a*b;
                   System.out.println("Answer        :   "+i);
                   break;
           case 4: d=((double)a/(double)b);
                   System.out.println("Answer        :   "+d);
                   break;
           case 5: i=a%b;
                   System.out.println("Answer        :   "+i);
                   break;
           default: System.out.println("Wrong Choice!");
           
           System.out.println("");
           System.out.println("");
           System.out.println("");
        }
     }
        
        public static void main(String args[]) throws IOException
        {
            Calculator calc=new Calculator();
            calc.print();
            calc.input();
            calc.select();
        }

}