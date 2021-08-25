list = [1,6,12,54,3,20,7,50]

find = int(input("Enter the number to be find: "))
flag = False
for i in list:
    if i == 3 or i == 6:
        continue
    if i == find:
        flag = True

if(flag):
    print("{0} is found in the list".format(find))
else:
    print("{0} not Found in the list".format(find))