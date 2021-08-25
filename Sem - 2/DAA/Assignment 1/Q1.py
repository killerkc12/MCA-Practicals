
a = [2,4,75,24,97,90]

max = 0
n = len(a)

for i in a:
    if i > max:
        max = i

print("Maximum number is {0}".format(max))