#include <stdio.h>
int v,m,n,x[30],h[30],y[30],i,j,temp[30],k,x2[30],a[30];
int main()
{
     x[]={1,2,3,4,5,6,7,8};
     y[]={9,3,4,1,7,6};
     m=8;
     l=6;
     if(m>n)
     {
        for(i=n;i<m;i++)
        {
            y[i]=0;
        }
        n=m;
     }
     else
     {
         for(i=m;i<n;i++)
         {
            x[i]=0;
         }
         m=n;
     }

     for(i=0;i<m;i++)
     {
         h[i]=0;
         for(j=0;j<n;j++)
         {
             h[i]+=x[j]*y[j];
         }
         v=y[0];
         for(j=1;j<n;j++)
         {
             y[j-1]=y[j];
         }
         y[n-1]=v;
     }
     for(i=0;i<m;i++)
     {
     printf("%d "); 
     }
     printf("\n\n");
     return 0;
}
