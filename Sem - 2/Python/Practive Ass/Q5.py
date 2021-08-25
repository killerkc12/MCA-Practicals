import random

start = int(input("Enter the starting number: "))
end = int(input("Enter the ending number: "))
step = int(input("Enter the steps: "))
print("Randomly selected element from {} to {} and {} steps".format(start,end,step))
for i in range(start,end,step):
    print(random.randint(i,end),end=" ")
print()