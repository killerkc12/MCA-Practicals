n = int(input("Enter the Number : "))
sum = 0
if n <= 0:
    print("{0} is not natural number".format(n))
else:
    for i in range(n,0,-1):
        sum += i
    print("Sum of {0} natural numbers is {1}".format(n,sum))