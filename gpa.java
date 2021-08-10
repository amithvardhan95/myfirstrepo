import java.io.*;
class gpa
{
	
	public static double rounding(double t)
	{
		double n;String a,d;int c;int e;int f;double g;
		n=t*100;
		f=(int)n;
		a=Double.toString(n);
		c=a.indexOf('.');
		d=a.substring(c+1,c+2);
		e=Integer.valueOf(d);
		if(e>=5)
		{
			f++;
		}
		g=(double)f;
		g=g/100;
		return g;
	}
	public static double[] eachSem() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		double ee[]=new double[5];
		int n,l;int cremar=0;int cre=0;int k=0;int p=0;int i;String name;double marks=0;int mark=0; boolean ll=true;double sgpa=0.0;int ctr=0;
		String mm="";
		System.out.print("Enter no of subjects : ");
		n=Integer.valueOf(br.readLine());
		System.out.print("Enter no of labs     : ");
		l=Integer.valueOf(br.readLine());
		System.out.println("\n");
		ll=true;
		for(i=0;i<n;i++)
		{
			System.out.print("Name of Subject "+(i+1)+" : ");
			name=br.readLine();
			System.out.print("Enter the no of credits for this subject : ");
			k=Integer.valueOf(br.readLine());
			System.out.print("Enter the marks scored in this subject   : ");
			marks=Double.valueOf(br.readLine());
			mark=(int)(Math.rint(marks));
			
			if(mark>=90 && mark<=100)
			{p=10;}
		    else if(mark>=80 && mark<90)
			{p=9;}
		    else if(mark>=70 && mark<80)
			{p=8;}
		    else if(mark>=60 && mark<70)
			{p=7;}
		    else if(mark>=50 && mark<60)
			{p=6;}
		    else if(mark>=40 && mark<50)
			{p=5;}
		    else
			{p=0;ll=false;ctr++;}
		    cremar+=(p*k);
			cre+=k;
		}
		System.out.println("");
		for(i=0;i<l;i++)
		{
			System.out.print("Name of Lab "+(i+1)+" : ");
			name=br.readLine();
			System.out.print("Enter the no of credits for this lab : ");
			k=Integer.valueOf(br.readLine());
			System.out.print("Enter the marks scored in this lab   : ");
			marks=Double.valueOf(br.readLine());
			mark=(int)(Math.rint(marks));
			if(mark>=68 && mark<=75)
			{p=10;}
		    else if(mark>=60 && mark<68)
			{p=9;}
		    else if(mark>=53 && mark<60)
			{p=8;}
		    else if(mark>=45 && mark<53)
			{p=7;}
		    else if(mark>=38 && mark<45)
			{p=6;}
		    else if(mark>=30 && mark<38)
			{p=5;}
		    else
			{p=0;ll=false;ctr++;}
		    cremar+=(p*k);
			cre+=k;
		}
		sgpa=((double)cremar/(double)cre);
		sgpa=gpa.rounding(sgpa);	
	    ee[0]=cremar;
		ee[1]=cre;
		
		if(ll)
		{ee[2]=sgpa;ee[3]=1;}
	    else
		{ee[2]=0;ee[3]=0;}
		ee[4]=ctr;
		return ee;
	}
	
	public static void semesters(int no) throws IOException
	{
		int i;double mm[];
		mm=new double[5];double x=0;
		mm[0]=0;mm[1]=0;mm[2]=0;mm[3]=0;mm[4]=0;
		double oo[]=new double[no];boolean j=true;
		int cremar=0;double cgpa=0;double cgp=0;double ppp=0;int ctr=0;
		String mmm="";
		int cre=0;
		for(i=0;i<no;i++)
		{
			System.out.println("\nSEMESTER "+(i+1)+"\n\n");
			mm=eachSem();
			System.out.println("\n");
			cremar+=mm[0];
			cre+=mm[1];
			oo[i]=mm[3];
			if(oo[i]==0)
			{j=false;}
		    else
			{j=true;}
		    x+=mm[4];
		}
		if(j)
		{
		cgpa=((double)cremar)/((double)cre);
		cgpa=gpa.rounding(cgpa);
		System.out.println(cgpa);
		}
		else
		{
			System.out.println("You have failed in "+((int)x)+" courses");
		}
	}

	
	public static void main(String args[]) throws IOException
	{
		int n;
		System.out.println("Enter the no of semesters you have in your course : ");
		n=Integer.valueOf(br.readLine());
		gpa.semesters(n);
	}
}