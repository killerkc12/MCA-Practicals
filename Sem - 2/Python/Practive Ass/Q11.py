def sumList(list):
    sum = 0
    for i in list:
        sum += i
    return sum

list = [3,34,64,22,34]
print("sum of the list {} is {}".format(list,sumList(list)))