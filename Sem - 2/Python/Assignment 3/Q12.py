num = int(input("Enter the number: "))

def recur_sum(n):
   if n <= 1:
       return n
   else:
       return n + recur_sum(n-1)

if num < 0:
   print("Enter a positive number")
else:
   print("The sum of {0} is {1}".format(num,recur_sum(num)))
