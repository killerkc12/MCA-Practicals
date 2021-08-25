n = int(input("Enter the number: "))
temp = n
sum = 0
len = len(str(n))
while n > 0:
    rem = n % 10
    sum += rem ** len
    n //=10
if temp == sum:
    print("{0} is an armstrong number".format(temp))
else:
    print("{0} is not an armstrong number".format(temp))