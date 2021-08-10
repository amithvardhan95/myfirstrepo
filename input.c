#include <stdio.h>
#include <stdlib.h>
#include <string.h>
char* input()
{
    char* s1;
    
    int i=0;
    s1=(char*)(malloc(1));
    while(1)
    {
        
        s1=(char*)(realloc(s1,i+1));
        s1[i]=getchar();
        if(s1[i]=='\n')
        {
            s1[i]='\0';
            break;
        }
        i++;
        
    }
    
    return s1;
}

int main()
{
    char *str;
    
    
    int a[8];int ctr=0;
    int i=0,j=0,p=0;
    
    printf("\n\n");
    for(i=0;i<8;i++)
    {
        str=input();
        a[i]=atoi(str);
    }
    
    for(i=1;i<8;i++)
    {
        p=a[i];ctr=0;
        for(j=i-1;j>=0;j--)
        {
            if(a[j]>a[i])
            {
                ctr++;
            }
            
        }
        if(ctr>0)
        {
            
        
        for(j=i;j>=(i-ctr+1);j--)
        {
            a[j]=a[j-1];
        }
        a[j]=p;
        
        }
        else{
            continue;
        }
    }
    
    for(i=0;i<8;i++)
    {
        

    printf("%d  ",a[i]);
    
    }
    
    printf("\n\n");
    return 0;
}