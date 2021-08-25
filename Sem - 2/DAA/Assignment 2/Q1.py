a = [4,2,54,67,343,54,2,1]
n = len(a)

def merge(a,l,m,r):
    n1 = m-l+1
    n2 = r-m

    L = [0] * (n1)
    R = [0] * (n2)

    for i in range(0,n1):
        L[i] = a[l+i]

    for j in range(0,n2):
        R[j] = a[m+1+j]

    i = 0
    j = 0
    k = l 

    while i<n1 and j<n2:
        if L[i] <= R[j]:
            a[k] = L[i]
            i += 1
        else:
            a[k] = R[j]
            j += 1
        k += 1

    while i<n1:
        a[k] = L[i]
        i += 1
        k += 1

    while j<n2:
        a[k] = R[j]
        j += 1
        k += 1

def MergeSort(a,l,r):
    if l<r:
        m = (l+(r-1))//2
        MergeSort(a,l,m)
        MergeSort(a,m+1,r)
        merge(a,l,m,r)

print("Input: {0}".format(a))
MergeSort(a,0,n-1)
print("Output: {0}".format(a))