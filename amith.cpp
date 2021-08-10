#include <iostream>
#include <cstdlib>
#include <ctime>
#include <unistd.h>

using namespace std;

int main()
{
    
    srand(time(0));
    int time=0,goalA=0,goalB=0,rA=0,rB=0;int maxtime=45;time=0;int i=0,j=0;int extratime=0;string c;int m1=0,m2=0;
    for(i=0;i<=maxtime;i++)
    {
       
       usleep(100000);
       system("clear");     
       cout << "\n\n" << endl;
       cout << goalA << "-" << goalB << endl;
       cout << "\n" << endl;
        cout << "Main Time         :   " << time << endl;
        cout << "Extra Time        :   " << extratime << endl;

       
       
       if(i==45)
       {maxtime=(45+((rand()%4)+1));}
       else if(i<45)
       {time++;}
       if(i>=45 && i<maxtime)
       {extratime++;}

       if(i==maxtime)
       {m1=maxtime;break;}

       rA=(rand()%40)+1;
       
       
       if(rA==1)
       {goalA++;continue;}

       rB=(rand()%40)+1;      

       if(rB==1)
       {goalB++;continue;}

      
       
      
    }
    
    cout << "\n\nPress ENTER key to start second half" << endl;
    maxtime=45;
    getline(cin,c);
    
    for(j=0,i=45;j<=maxtime;j++,i++)
    {
       
       usleep(100000);
       system("clear");     
       cout << "\n\n" << endl;
       cout << goalA << "-" << goalB << endl;
       
        cout << "\n" << endl;
        cout << "Main Time         :   " << time << endl; 
        cout << "Extra Time        :   " << extratime << endl;

       
       
       
       if(j==45)
       {maxtime=(45+((rand()%4)+1));}
       else if(j<45)
       {time++;}
       if(j>=45 && j<maxtime)
       {extratime++;}

       if(j==maxtime)
       {m2=maxtime;break;}

       rA=(rand()%40)+1;
       
       
       if(rA==1)
       {goalA++;continue;}

       rB=(rand()%40)+1;      

       if(rB==1)
       {goalB++;continue;}

      
       
      
    }
    
    cout << "\n\nPress ENTER key to end the game" << endl;
    getline(cin,c);
    
    cout << "\n" << endl;
    
    if(goalA>goalB)
    {
    cout << "Team A won!" << endl;
}
    else if(goalA<goalB)
    {
    cout << "Team B won!" << endl;
}
    else if(goalA==goalB)
    {
    cout << "Match Drawn!" << endl;
}
    
   
   
    
    cout << "\n\n" << endl;
    return 0;

}