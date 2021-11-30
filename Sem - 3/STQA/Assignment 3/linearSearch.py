def linearSearch(list, number):
    for i in range(len(list)):
        if list[i] == number:
            return i
    return -1
list = []
n = int(input("Enter the number of elements in the list: "))
for i in range(n):
    list.append(int(input("Enter the number: ")))

number = int(input("Enter the number to be searched: "))
index = linearSearch(list, number)
if index == -1:
    print("Number not found")
else:
    print("Number found")