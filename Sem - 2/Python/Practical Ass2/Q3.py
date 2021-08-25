import  math

n = int(input("Ente the Number: "))
power = len(str(n))
temp = n
sum = 0
while n > 0:
    rem = n % 10
    sum += rem ** power
    n //= 10

if temp == sum:
    print("{0} is the Armstrong Number".format(temp))
else:
    print("{0} is not a Armstrong Number".format(temp))
