import java.io.*;
class TestClass
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T,N;int c[];int t[];int i,j,k;String a1;String a2[];
		int a[];int x=0;int mini=0;int p[];
		T=Integer.valueOf(br.readLine());
		p=new int[T];
		for(i=0;i<T;i++)
		{
			N=Integer.valueOf(br.readLine());
			a1=br.readLine();
			a2=a1.split(" ");
			a=new int[a2.length];
			for(j=0;j<a2.length;j++)
			{
				a[j]=Integer.valueOf(a2[j]);
			}
			x=(a[0] & a[1]) ^ (a[0] | a[1]);
			mini=x;
			for(k=2;k<a.length;k++)
			{
				x=(a[0] & a[k]) ^ (a[0] | a[k]);
				mini=((int)(Math.min(mini,x)));
			}
			for(j=1;j<a.length-1;j++)
			{
				for(k=j+1;k<a.length;k++)
				{
					x=(a[j] & a[k]) ^ (a[j] | a[k]);
				    mini=((int)(Math.min(mini,x)));
				}
			}
			p[i]=mini;
		}
		for(i=0;i<T;i++)
		{
			System.out.println(p[i]);
		}
	}
}