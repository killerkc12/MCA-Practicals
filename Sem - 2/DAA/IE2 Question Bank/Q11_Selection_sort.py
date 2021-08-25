import sys

def SelectionSort(list):
    for i in range(len(list)):
        min_index = i
        for j in  range(i+1,len(list)):
            if list[j] < list[min_index]:
                min_index = j
        list[i],list[min_index] = list[min_index],list[i]

list = [12,54,22,75,11,3,63,1]
print("List is : ",list)
SelectionSort(list)
print("Sorted List is : ",list)