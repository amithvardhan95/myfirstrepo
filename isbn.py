import os


def isisbn(num):
    if len(num) & int(num,10)%10==0:
       return True
    else:
       return False


os.system("clear")
print("")
print("")
print("")
print("Enter the number     :   "),
numb=str(input())
print("")
print("")
if isisbn(numb):
   print(numb+" is an ISBN number")
else:
   print(numb+" is not an ISBN number")


print("")
print("")
print("")
