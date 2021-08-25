a = [4,6,2,87,32,22,6,8]
n = len(a)
k = 1


def SearchElement(a,n,k):
    for i in a:
        if k == i: 
            return True
    return False    
    
if SearchElement(a,n,k):
    print("Element is Found!")
else:
    print("Element not Found")


