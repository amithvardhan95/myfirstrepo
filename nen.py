T=int(input())

qq=[]
for i in range(0,T):
    s=input()

    s=s.split(" ")

    M=int(s[0])
    K=int(s[1])

    S=input()

    l=[]
    if len(S)>1:
        for i in range(0,len(S)):
            k=S[0:i]+S[i+1:len(S)]
            k=int(k)
            l.append(k%K)
    k=int(S)
    l.append(k%K)
    qq.append(max(l))
for i in qq:
    print(i)