from array import *
import os




n=0
rollnumber=array('d',[0,0])
q1=array('d',[0,0])
q2=array('d',[0,0])
q3=array('d',[0,0])
q4=array('d',[0,0])
q5=array('d',[0,0])

     

def maximum(arr):
         maxi=0
         for i in range(0,len(arr)-2):
             if arr[i]>arr[i+1]:
                maxi=arr[i]
             else:
                maxi=arr[i+1]
         return maxi

def minimum(arr):
         mini=0
         for i in range(0,len(arr)-2):
             if arr[i]>arr[i+1]:
                mini=arr[i+1]
             else:
                mini=arr[i]
         return mini

def average(arr):
         su=0
         ar=0
         for i in range(0,len(arr)-1):
             su+=arr[i]
         ar=su/len(arr)
         return ar
     
def accept():
         print("Enter the number of students      :   "),
         n=input()
         print("")
         print("")
         os.system("clear")
         for i in range(0,n-1):                        
             print("                 STUDENT "+str(i+1)+"                 ")
             print("Enter your roll number       :    "),
             rollnumber[i]=input()
             rollnumber.append(0)
             print("")
             print("Marks in Quiz 1              :    "),
             q1[i]=input()
             q1.append(0)
             print("Marks in Quiz 2              :    "),
             q2[i]=input()
             q2.append(0)
             print("Marks in Quiz 3              :    "),
             q3[i]=input()
             q3.append(0)
             print("Marks in Quiz 4              :    "),
             q4[i]=input()
             q4.append(0)
             print("Marks in Quiz 5              :    "),
             q5[i]=input()
             q5.append(0)
             print("")
             
                

             
         highscore1=maximum(q1)
         highscore2=maximum(q2)
         highscore3=maximum(q3)
         highscore4=maximum(q4)
         highscore5=maximum(q5)
         lowscore1=minimum(q1)
         lowscore2=minimum(q2)
         lowscore3=minimum(q3)
         lowscore4=minimum(q4)
         lowscore5=minimum(q5)
         avg1=average(q1)
         avg2=average(q2)
         avg3=average(q3)
         avg4=average(q4)
         avg5=average(q5)
         return

def display():
          accept()
          os.system("clear")
          print("")
          print("")
          print("")
          print("      STUDENT       QUIZ 1       QUIZ 2       QUIZ 3       QUIZ 4       QUIZ 5      ")
          for i in range(0,n-1):
                print(str(rollnumber[i])+"     "+str(q1[i])+"   "+str(q2[i])+"     "+str(q3[i])+"    "+str(q4[i])+"    "+str(q5[i])+"    ")

          print("    High Score     "+str(highscore1)+"     "+str(highscore2)+"     "+str(highscore3)+"     "+str(highscore4)+"     "+str(highscore5))
          print("    Low Score      "+str(lowscore1)+"     "+str(lowscore2)+"     "+str(lowscore3)+"     "+str(lowscore4)+"     "+str(lowscore5))
          print("    Average        "+str(avg1)+"     "+str(avg2)+"     "+str(avg3)+"     "+str(avg4)+"     "+str(avg5))






display()


          

             
