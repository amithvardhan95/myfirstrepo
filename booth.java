import java.io.*;

public class booth
{




    public static String binary(int num)
    {
        int n=num;
        int i,r;
        String bin="";
        while(n>0)
        {
            r=n%2;
            n=n/2;
            bin=r+bin;
        }
        return bin;
    }




    public static String add(String p,String q)
    {
        String res="";
        char a,b,c;
        a='\0';
        b='\0';
        c='0';
        int i;
        int inr=0;
        int l1,l2,l;
        l1=p.length();
        l2=q.length();
        for(i=0;i<Math.abs(l1-l2);i++)
        {
            if(l1>l2)
            {
                q="0"+q;
            }
            if(l1<l2)
            {
                p="0"+p;
            }
        }
        l=Math.max(l1,l2);
        for(i=l-1;i>=0;i--)
        {
            a=p.charAt(i);
            b=q.charAt(i);
            inr=(((int)a)-48)*100+(((int)b)-48)*10+(((int)c)-48);
            switch(inr)
            {
            case 0:
                res="0"+res;c='0';
                break;
            case 1:
            case 10:
            case 100:
                res="1"+res;c='0';
                break;
            case 11:
            case 101:
            case 110:
                res="0"+res;c='1';
                break;
            case 111:
                res="1"+res;c='1';
                break;
            default:

            }
        }
        return res;

    }






    public static String comp(String str)
    {
        String res="";
        int i;
        int l=str.length();
        for(i=0;i<l;i++)
        {
            if(str.charAt(i)=='1')
            {
                res+="0";
            }
            if(str.charAt(i)=='0')
            {
                res+="1";
            }
        }
        res=add(res,"1");
        return res;
    }



    public static int decimal(String str)
    {
        int i,l;
        l=str.length();
        int res=0;
        int j=0;
        for(i=l-1,j=0;i>=0;i--,j++)
        {
            if(str.charAt(i)=='1')
            {
                res+=Math.pow(2,j);
            }
        }
        return res;
    }


    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n1,n2;String a,b;int l1,l2,i;String ss="";String hh="0";String uu="";String kk="";int ctr=0;int jj=0;int l;
        System.out.print("Enter the first number        :    ");
        n1=Integer.valueOf(br.readLine());
        System.out.print("Enter the second number       :    ");
        n2=Integer.valueOf(br.readLine());
        a=binary(Math.abs(n1));
        b=binary(Math.abs(n2));
        l1=a.length();
        l2=b.length();


        for(i=0;i<Math.abs(l1-l2);i++)
        {
            if(l1>l2)
            {
                b="0"+b;
            }
            if(l1<l2)
            {
                a="0"+a;
            }
        }


        if(n1<0)
        {
            a="1"+comp(a);
        }
        else
        {
            a="0"+a;
        }

        if(n2<0)
        {
            b="1"+comp(b);
        }
        else
        {
            b="0"+b;
        }

        l=a.length();

        for(i=0;i<l;i++)
        {
            ss+="0";
        }




        ss+=b;
        ss+="0";
        ctr=ss.length();

        for(i=l-1;i>=0;i--)
        {
            uu=ss.substring(0,l);

            jj=Integer.valueOf(ss.substring(ctr-2,ctr));
            switch(jj)
            {
            case 1:
                uu=add(uu,a);
                break;
            case 10:
                uu=add(uu,comp(a));
                break;
            default:


            }

            ss=uu.charAt(0)+uu+ss.substring(l,ctr-1);
            uu=ss.substring(0,l);

        }




        System.out.print("Final Answer                  :    ");
        if(ss.charAt(0)=='0')
        {

            System.out.println(decimal(ss.substring(1,ctr-1)));
        }
        if(ss.charAt(0)=='1')
        {
            System.out.println(-decimal(comp(ss.substring(1,ctr-1))));
        }

    }



}
