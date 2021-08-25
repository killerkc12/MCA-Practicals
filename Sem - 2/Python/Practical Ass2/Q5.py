n1 = int(input("Enter 1st number: "))
n2 = int(input("Enter 2nd number: "))
n3 = int(input("Enter 3rd number: "))
max = 0
if n1 > n2 and n1 > n3:
    max = n1
elif n2 > n1 and n2 > n3:
    max = n2
else:
    max = n3
print("{0} is the largest number among {1}, {2}, {3} ".format(max,n1,n2,n3))