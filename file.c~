#include <stdio.h>
#include <stdlib.h>
char* inpstr()
{
     char *str;int i=0;char c=' ';
     str=(char*)malloc(1);
     while(c!='\n')
     {
         str=(char*)realloc(str,i+2);
         c=getchar();
         str[i]=c;
         if(str[i]=='\n')
         {str[i]='\0';}
         i++;
     }
     return str;
}
int main()
{
     FILE* f;char* ch;int ii=0;
     f=fopen("amith.c","w");
     ch=inpstr();
     fprintf(f,"%s\n",ch);
     fclose(f);
     return 0;
}
