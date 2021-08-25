import random
n = 35
n1 = 25
n2 = 50

print("random int betweeen 0 to {} is {} ".format(n1,random.randrange(n1)) )
print("random int betweeen {} to {} is {}".format(n1,n2,random.randrange(n1,n2)))
print("random int betweeen {} to {} skipping {} ".format(n1,n2,n,random.randrange(n1,n2)))
print("random.randint(a, b): returns N; a <= N <=b : ", random.randint(3, 6)) 
list1 = [1, 2, 3, 4, 5, 6, 7, 8]
print("returns random element from sequence:",random.choice(list1))


print("Before Shuffling: ", list1)
print("random.shuffle(sequence): returns random element from sequence")
random.shuffle(list1)
print("After Shuffling: ", list1) 