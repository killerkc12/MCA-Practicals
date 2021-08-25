def FiboSeries(n):
    n1 = 0
    n2 = 1
    if n >= 1:
        print(n1,end=" ")
    if n >= 2:
        print(n2,end=" ")
    for i in range(2,n):
        n3 = n1 + n2
        print(n3, end=" ")
        n1 = n2
        n2 = n3

n = int(input("Enter the Number: "))
FiboSeries(n)
print()