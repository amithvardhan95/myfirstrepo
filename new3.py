from math import *


qq=[]
T=int(input())
for i in range(0,T):
    N=int(input())
    x=N
    maxi=int(pow(10,x))
    p=[]
    q=[]
    w=0
    ctr=0
    if x==0:
        ctr=0
    elif x==1:
        ctr=10
    elif x==2:
        ctr=99
    else:
        ctr=99
        w=0
        for i in range(100,maxi):
            x=str(i)
            w=0
            for j in range(0,len(x)-1):
                k=x[j:j+2]
                if int(k)==13:
                    w+=1
            if w==0:
                ctr+=1
    qq.append(ctr)

for i in qq:
    print(i%1000000009)