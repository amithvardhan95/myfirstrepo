import os



def carpet(leng,wid,dis,pri):
          area=leng*wid
          labcost=0.35*area
          carppri=pri*area
          discount=(dis*(carppri+labcost))/100
          disc=(carppri+labcost)-discount
          taxrate=8.5*disc
          os.system("clear")
          print("")
          print("")
          print("                       MEASUREMENT                       ")
          print("")
          print("Length                                 $"+str(leng)+" ft")
          print("Width                                  $"+str(wid)+" ft")
          print("Area                                   $"+str(area)+" ft")
          print("")
          print("                         CHARGES                         ")
          print("")
          print("DESCRIPTION          COST/SQ.FT.         CHARGE          ")
          print("-----------          -----------         ------          ")
          print("Carpet                $"+str(pri)+"         $"+str(carppri)+"  ")
          print("Labour                $0.35            $"+str(labcost)+"  ")
          print("                                        ----------------  ")
          print("INSTALLED PRICE                        $"+str((carppri+labcost)))
          print("Discount              $"+str(dis)+"        $"+str(discount))
          print("                                        ----------------  ")
          print("SUBTOTAL                               $"+str(disc))
          print("Tax                                    $"+str(taxrate))
          print("Total                                  $"+str((disc+taxrate)))
          print("")
          print("")
          return 0




os.system("clear")
print("")
print("")
print("")
print("Enter the length of the room          :    "),
l=input()
print("Enter the width of the room           :    "),
w=input()
print("Enter the customer discount           :    "),
d=input()
print("Enter the cost per square foot        :    "),
s=input()
print("")


carpet(l,w,d,s)




       
