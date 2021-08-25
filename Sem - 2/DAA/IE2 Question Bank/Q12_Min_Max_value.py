import sys

def Max(list):
    max = 0
    for item in list:
        if item > max:
            max = item
    return max

def Min(list):
    min = sys.maxsize
    for item in list:
        if item < min:
            min = item
    return min

list = [12,54,22,75,11,3,63,1]
print("List is: ",list)
print("Max value is: ",Max(list))
print("Min value is : ",Min(list))