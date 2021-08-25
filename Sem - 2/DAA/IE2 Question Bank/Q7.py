def PrimeNumber(n):
    for i in range(2,n):
        if n%i==0:
            return 0
    return 1

n = int(input("Enter the Number: "))
if(PrimeNumber(n)):
    print(n," is the Prime number")
else:
    print(n," is not Prime number")