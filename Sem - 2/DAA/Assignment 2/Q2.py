a = [1,2,5,9,65,98,588,3211]
n = len(a)
s = int(input("Enter the Element to be Search: "))

def binarySearch(a,l,r,s):
    mid = (l+(r-l))//2
    #base case
    if l>r:
        return -1

    if a[mid] == s:
        return mid

    if s < mid:
        return binarySearch(a,l,mid-1,s)
    else:
        return binarySearch(a,mid+1,r,s)

if binarySearch(a,0,n-1,s) == -1:
    print("{0} element not found".format(s))
else:
    print("{0} element found at index {1}".format(s,binarySearch(a,0,n-1,s)))