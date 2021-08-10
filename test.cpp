#include <iostream>
#include <cstdlib>
#include <ctime>
#include <time.h>


using namespace std;

int main()
{
    int i=0,overA=0,ballA=0,overB=0,ballB=0,wicketsA=0,runsA=0,ranA=0,wickA=0;
    srand(time(0));string c;int runsB=0,ranB=0,wickB=0,wicketsB=0;bool wickwin=0;
    cout << "\n\n\nTEAM A\n\n" << endl;
    for(i=0;;i++)
    {
        overA=i/6;
        ballA=i%6;
        system("clear");
        cout << "\n\n\nTEAM A\n\n" << endl;
        if(ballA==0 || wicketsA==10)
        {
            
            cout << "\n" << endl;
            cout << "Score     :  " << runsA << "/" << wicketsA << endl;
            cout << "Overs     :  " << overA << "." << ballA << endl;
            cout << "\n\n" << endl;
            
            if(wicketsA==10)
            { 
               cout << "Press ENTER key to set team B as batting team" << endl;
               getline(cin,c);
               break;
            }
            else
            {
               cout << "Press ENTER key to bowl another over" << endl;
               getline(cin,c);
            }
        }
        
        
        
        
        wickA=rand()%75;
        if(wickA!=0)
        {
           ranA=rand()%2;
           if(ranA==5 || ranA==3)
           {ranA=0;}
           runsA+=ranA;
        }
        else if(wickA==0)
        {
           runsA+=0;
           wicketsA++;
           
        }
        
    }

    cout << "\n\n" << endl;
 
    
   
    for(i=0;;i++)
    {
        overB=i/6;
        ballB=i%6;
        system("clear");
        cout << "\n\n\nTEAM B\n\n" << endl;    
        if(ballB==0 || wicketsB==10)
        {
            
            cout << "\n" << endl;
            cout << "Score     :  " << runsB << "/" << wicketsB << endl;
            cout << "Overs     :  " << overB << "." << ballB << endl;
            cout << "\n\n" << endl;
           
            
            
            if(wicketsB==10)
            {
              cout << "Press ENTER key to end the match" << endl;
              getline(cin,c);
              break;
            }
            else
            {
               cout << "Press ENTER key to bowl another over" << endl;
               getline(cin,c);
            }
        }
        
        
        
       
        wickB=rand()%75;
        if(wickB!=0)
        {
           ranB=rand()%2;
           if(ranB==5 || ranB==3)
           {ranB=0;}
           runsB+=ranB;
        }
        else if(wickB==0)
        {
           runsB+=0;
           wicketsB++;
           
        }
        
        
    }
   
    system("clear");


     cout << "\n\n\nTEAM A\n\n" << endl;
     cout << "Score     :  " << runsA << "/" << wicketsA << endl;
     cout << "Overs     :  " << overA << "." << ballA << endl;
     cout << "\n\n" << endl; 
     cout << "\n\nTEAM B\n\n" << endl;
     cout << "Score     :  " << runsB << "/" << wicketsB << endl;
     cout << "Overs     :  " << overB << "." << ballB << endl;
     cout << "\n" << endl; 

    if(wickwin==1)
    {
     
     cout << "Team B Won by " << (10-wicketsB) << " wickets " << endl;
    }
    else
    {cout << "Team A Won by " << abs(runsB-runsA) << " runs " << endl;}

   cout << "\n" << endl;
    
    return 0;


}
