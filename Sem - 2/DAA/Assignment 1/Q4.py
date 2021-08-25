a = [34,65,32,78,4,98,2]

min = 0

for i in range(len(a)):
    min = i
    for j in range(i+1,len(a)):
        if a[j] < a[min]:
            min = j
    a[i],a[min] = a[min],a[i]

print(a)
