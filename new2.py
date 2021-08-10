from math import *

T=int(input())
c=[]
t=[]
for i in range(0,T):
    N=int(input())
    a=input()
    a=a.split(" ")
    x=0
    p=[]
    for j in range(0,len(a)):
        a[j]=int(a[j])
    for j in range(0,len(a)-1):
        for k in range(j+1,len(a)):
            x=(a[j] & a[k]) ^ (a[j] | a[k])
            p.append(x)
    t.append(min(p))
for i in t:
    print(i)