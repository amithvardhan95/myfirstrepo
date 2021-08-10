def interest(p):
     r=5.3
     n=12/4
     a=P*pow(1+(r/100),n)
     return a

print("Enter the Principal Amount      :   "),
P=input()

amt=interest(P)
i=amt-P
print("Total Amount       :   "+str(amt))
print("Interest           :   "+str(i))

