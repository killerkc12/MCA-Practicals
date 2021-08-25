n = int(input("Enter the Number: "))

result = ""
if n == 0:
    result = "Zero"
if n > 0:
    result = "Positive Number"
if n < 0:
    result = "Negative Number"

print("{0} is {1}".format(n,result))