n = 12345
n1 = n
str = "kiran"

str2 = str[::-1]
n2 = 0
while n>0:
    rem = n % 10
    n2 = n2*10 + rem
    n //=10

print("{0} is the reverse of {1}".format(n2,n1))
print("{0} is the reverse of {1}".format(str2,str))
