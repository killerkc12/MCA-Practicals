list = [1,6,12,54,3,20,7,50]
cntOdd = 0
cntEven = 0

for i in list:
    if i%2 == 0:
        cntEven +=1
    else:
        cntOdd +=1

print("{0} Even numbers in the list".format(cntEven))
print("{0} Odd numbers in the list".format(cntOdd))