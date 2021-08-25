def FeboRecur(n):
    if n  <= 1:
        return n
    return FeboRecur(n-1) + FeboRecur(n-2)
    

n = int(input("Enter the Number : "))
for i in range(n):
    print(FeboRecur(i))