def SumArray(list,n):
    if n <=0 :
        return 0
    return SumArray(list,n-1)+list[n-1]

list = [12,54,22,75,11,3,63,1]
print("Sum of Array is : ",SumArray(list,len(list)))