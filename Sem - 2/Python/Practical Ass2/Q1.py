n = int(input("Enter the Number: "))

flag = True
for i in range(2,n):
    if n%i == 0:
        flag = False
        break

if n ==1:
    flag = False

if flag == True:
    print("{0} is the Prime Number".format(n))
else:
    print("{0} is not Prime Number".format(n))
