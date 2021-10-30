# create a prime number function that returns
# a list of prime numbers between 2 and n
def prime_numbers(n):
    prime_list = []
    for i in range(2, n):
        for j in range(2, i):
            if i % j == 0:
                break
        else:
            prime_list.append(i)
    return prime_list

# create a function that returns the sum of all items from the listed
def get_sum(list):
    sum = 0
    for i in list:
        sum += i
    return sum