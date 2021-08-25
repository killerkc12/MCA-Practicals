file = open("sample.txt","r")
array = []
for line in file:
    array.append(line)
print("Array of each line from File: ")
print(array)