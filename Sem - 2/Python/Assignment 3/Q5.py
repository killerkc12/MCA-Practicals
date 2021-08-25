a = int(input("Enter the 1st number: "))
b = int(input("Enter the 1st number: "))

def hcf(a,b):
    while b:
        a,b = b, a % b
    return a

print("HCF of {0} and {1} is {2}".format(a,b,hcf(a,b)))