A = [3,5,7,43,2,1,7]

min = max = A[0]

for i in A:
    if i > max:
        max = i
    if i < min:
        min = i

print("max = ",max)
print("min = ",min)