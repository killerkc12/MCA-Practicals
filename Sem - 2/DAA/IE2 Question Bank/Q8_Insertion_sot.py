def InsertionSort(list):
    for i in range(1,len(list)):
        currentValue = list[i]
        j = i-1
        while j >= 0 and currentValue < list[j]:
            list[j+1] = list[j]
            j -= 1
        list[j+1] = currentValue

list = [12,54,22,75,11,3,63,1]
InsertionSort(list)
print("Unsorted List : ",list)
print("Sorted list using Insertion sort is : ")
for i in list:
    print(i,end=" ")
print()