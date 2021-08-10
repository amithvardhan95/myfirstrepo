#include <iostream>
#include <cstdlib>
#include <cstring>
#include <cmath>
using namespace std;

int strtoint(string str)
{
   int l,i,ctr=0;int res=0;
   l=str.length();
   for(i=0;i<l;i++)
   {
      if((int)(str.at(i))>=48 && (int)(str.at(i))<=57)
      {ctr++;}
      else
      {continue;}
      
      
   }
   ctr--;
   for(i=0;i<l;i++)
   {
      if((int)(str.at(i))>=48 && (int)(str.at(i))<=57)
      {res+=(pow(10,ctr)*(((int)str.at(i))-48));ctr--;}
      else
      {continue;}
      
      
   }
   return res;
   
}

int rowctr(int *at, int l1)
{
    int rows1=0,i1=0,n1=0;
    while(n1<l1)
    {
        n1+=pow(2,rows1);
        rows1++;
    }
    rows1++;
    return rows1;
}



int heapify(int *arr,int l)
{
    int ctr=0,i=0,noofvalues=0,start=0,end=0,d=0,e=0,f=0;
    int row=0,j=0;int o=0;
    row=rowctr(arr,l);
    for(o=0;o<(l*4);o++)
    {
    for(ctr=(row-1);ctr>=1;ctr--)
    {
        noofvalues=pow(2,ctr-1);
        start=(noofvalues-1);
        end=(pow(2,ctr)-2);
        for(i=start;i<=end;i++)
        {
            d=i;
            e=i*2+1;
            f=i*2+2;
            
            if(e>(l-1))
            {
                break;
            }
            if(f>(l-1))
            {
                f=(l-1);
            }
            
            if(arr[e]<arr[f])
            {
                j=f;
            }
            else
            {
                j=e;
            }
            if(arr[d]<arr[j])
            {
                arr[j]=arr[j]+arr[d];
                arr[d]=arr[j]-arr[d];
                arr[j]=arr[j]-arr[d];
            }
        }
    }
    }
    
    return 0;
}

int main()
{
    string str;int a[8];int u[8];
    int k=0;int len=7;
    for(k=0;k<8;k++)
    {
        getline(cin,str);
        a[k]=strtoint(str);
    }
    
    heapify(a,8);
    
    for(k=0;k<8;k++)
    {
        if(k!=6)
        {
        a[0]=a[0]+a[len];
        a[len]=a[0]-a[len];
        a[0]=a[0]-a[len];
        u[k]=a[len];
        heapify(a,len);
        len--;
        }
        if(k==6)
        {
            if(a[0]>a[1])
            {
                u[k]=a[0];
                u[k+1]=a[1];
                
            }
            else
            {
                u[k]=a[1];
                u[k+1]=a[0];
                
            }
            break;
        }
        
        
                
    }
     cout << "" << endl; 
    for(k=0;k<8;k++)
    {
        cout << u[k] << "   ";
    }
    
    cout << "" << endl;
    
}
