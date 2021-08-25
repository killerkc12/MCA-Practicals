dec = int(input("Enter the Decimal Number: "))

def convertToBinary(n):
   if n > 1:
       convertToBinary(n//2)
   print(n % 2,end = '')

convertToBinary(dec)
print()
