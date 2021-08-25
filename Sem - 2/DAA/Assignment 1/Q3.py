a = 45
b = 89
gcd = 0

i = 1
while(i<=a and i<=b):
    if a%i==0 and b%i==0:
        gcd = i
    i += 1
    
print("GCD of {0} and {1} is {2}".format(a,b,gcd))