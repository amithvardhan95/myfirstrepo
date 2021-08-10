from os import *


i=0
j=0
print("Enter no of semesters in your course   :  ",end="")
sems=int(input())
subjects=[]
marks1=[]
credits1=[]
fail1=[]
labs=[]
marks2=[]
credits2=[]
fail2=[]
print("")
print("")
print("")
print("")
for i in range(0,sems):
    system("clear")
    print("Enter no of subjects in semester",(i+1),": ",end="")
    sub=int(input())
    print("")
    print("")
    l=[]
    m=[]
    v=[]
    f1=[]
    for j in range(0,sub):
        print("Enter name of subject",(j+1),": ",end="")
        x=input()
        l.append(x)
        print("Enter no of credits in subject",(j+1),": ",end="")
        z=int(input())
        v.append(z)
        print("Enter marks in subject",(j+1),": ",end="")
        gh=int(round(float(input())))
        if gh>=90 and gh<=100:
            y=10
            f1.append(True)
        elif gh>=80 and gh<90:
            y=9
            f1.append(True)
        elif gh>=70 and gh<80:
            y=8
            f1.append(True)
        elif gh>=60 and gh<70:
            y=7
            f1.append(True)
        elif gh>=50 and gh<60:
            y=6
            f1.append(True)			
        elif gh>=40 and gh<50:
            y=5
            f1.append(True)
        else:
            y=0
            f1.append(False)
        m.append(y)
        print("")
    subjects.append(l)
    credits1.append(v)
    marks1.append(m)
    fail1.append(f1)
    print("")
    print("")
    print("")
    print("Enter no of labs in semester",(i+1),": ",end="")
    la=int(input())
    print("")
    print("")
    p=[]
    q=[]
    r=[]
    f2=[]
    for j in range(0,la):
        print("Enter name of lab",(j+1),": ",end="")
        x=input()
        p.append(x)
        print("Enter no of credits in lab",(j+1),": ",end="")
        z=int(input())
        r.append(z)
        print("Enter marks in lab",(j+1),": ",end="")
        gh=int(round(float(input())))
        if gh>=68 and gh<=75:
            y=10
            f2.append(True)
        elif gh>=60 and gh<68:
            y=9
            f2.append(True)
        elif gh>=53 and gh<60:
            y=8
            f2.append(True)
        elif gh>=45 and gh<53:
            y=7
            f2.append(True)
        elif gh>=38 and gh<45:
            y=6
            f2.append(True)			
        elif gh>=30 and gh<38:
            y=5
            f2.append(True)
        else:
            y=0
            f2.append(False)
        q.append(y)
        print("")
    labs.append(p)
    credits2.append(r)
    marks2.append(q)
    fail2.append(f2)
    print("")
    print("")
    print("")
    print("")

sgpa=[]

system("clear")
print("")
print("")
for i in range(0,sems):
    p=True
    x=0
    y=0
    ctr=0
    failure1=0
    failure2=0
    for j in fail1[i]:
        if not j:
            p=False
            failure1+=1
        else:
            x+=credits1[i][ctr]*marks1[i][ctr]
            y+=credits1[i][ctr]
        ctr+=1
    ctr=0
    for j in fail2[i]:
        if not j:
            p=False
            failure1+=1
        else:
            x+=credits2[i][ctr]*marks2[i][ctr]
            y+=credits2[i][ctr]
        ctr+=1
    if p:
	    sgpa.append(round(x/y,2))
    else:
	    ss="Failed in "+str(failure1)
	    sgpa.append(ss)


for i in range(0,sems):
    ctr=0
    print("   ","Semester",(i+1))
    print("")
    for j in subjects[i]:
        print("   ",j," : ",marks1[i][ctr])
        ctr+=1
    print("")
    ctr=0
    for j in labs[i]:
        print("   ",j," : ",marks2[i][ctr])
        ctr+=1
    print("")
    print("   ","SGPA : ",sgpa[i])
    print("")
    print("")
