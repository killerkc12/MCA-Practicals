import sys
def findLargeAndSmall(list):
    large = 0
    small = sys.maxsize
    for i in list:
        large = i if i > large else large
        small = i if i < small else small
    return large,small

list = [23,443,64,1,75,33]
large, small = findLargeAndSmall(list)
print("List is ",list)
print("Larger number is :",large)
print("smaller number is :",small)