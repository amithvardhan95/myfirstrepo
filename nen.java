import java.io.*;
class nen
{
	public static int summing(int a[])
	{
		int i;int sum=0;
		for(i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		return sum;
	}
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int A[];int N;int i,T,K;String s1,s[];int j;int h=0;int ctr=0;int avg=0;int p=0;
		int gg[];
		T=Integer.valueOf(br.readLine());
		gg=new int[T];
		for(i=0;i<T;i++)
		{
			s1=br.readLine();
			s=s1.split(" ");
			N=Integer.valueOf(s[0]);
			K=Integer.valueOf(s[1]);
			s1=br.readLine();
			s=s1.split(" ");
			A=new int[s.length];
			for(j=0;j<s.length;j++)
			{
				A[j]=Integer.valueOf(s[j]);
			}
			ctr=A.length;
			h=summing(A);
			p=0;
			avg=((int)(h/ctr));
			if(avg<=K)
			{gg[i]=p;continue;}
		    ctr++;
			h++;
			p++;
			while(true)
			{
				avg=((int)(h/ctr));
				if(avg<=K)
				{break;}
			    else
				{
					h++;
					continue;
				}
			}
			gg[i]=p;
		}
		for(i=0;i<T;i++)
		{
			System.out.println(gg[i]);
		}
	}
}