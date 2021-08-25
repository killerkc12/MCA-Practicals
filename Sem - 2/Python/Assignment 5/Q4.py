n1 = int(input("Enter Numerator: "))
n2 = int(input("Enter Denominator: "))
try:
    print("Division of {} and {} is {}".format(n1,n2,n1/n2))
except:
    print("ZeroDivisionError")
else:
    print("Done")