print "Enter the number      :    ",
num=input()
i=0
n=num
res=""
ser=""
st=str(num)
l=len(st)
while n>0:
    r=n%2
    n=n/2
    res+=st

for i in range(l-1,0,-1):
    ser+=res[i]


print(ser)
