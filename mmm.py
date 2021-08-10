a=input()

a=a.split(" ")

for i in range(0,len(a)):
    a[i]=int(a[i])
b=[]
for i in range(0,len(a)):
    b.append(i+1)

for i in range(0,len(a)-1):
    for j in range(i+1,len(a)):
        if a[i]<a[j]:
            c=a[i]
            a[i]=a[j]
            a[j]=c
			
            d=b[i]
            b[i]=b[j]
            b[j]=d


for i in range(0,len(a)-1):
    if a[i]==a[i+1]:
        if b[i]>b[i+1]:
            c=b[i]
            b[i]=b[i+1]
            b[i+1]=c

print()
print(a)
print(b)

print()


