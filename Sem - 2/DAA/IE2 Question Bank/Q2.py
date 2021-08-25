def GCD(A,B):
    i = 1
    gcd = 0
    while(i <= A and i <= B):
        if A%i==0 and B%i==0:
           gcd = i 
        i += 1
    return gcd

A = 20
B = 5
print("GCD of {} and {} is : {}".format(A,B,GCD(A,B)))