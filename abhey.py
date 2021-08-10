T=int(input())
c=[]
for i in range(0,T):
    N=int(input())
    o=[]
    for j in range(0,N):
        s=input()
        s=s.split(" ")
        for k in range(0,len(s)):
            s[k]=int(s[k])
        o.append(s)
    ctr=0
    for j in range(0,N):
        for k in range(0,N):
            for l in range(j,N):
                for m in range(k,N):
                    if o[j][k]>o[l][m]:
                        ctr+=1
    c.append(ctr)

for i in c:
    print(i)