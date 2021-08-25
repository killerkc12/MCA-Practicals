a = [4,2,54,67,343,54,2,1]
n = len(a)

def partition(a,start,end):
    pivot_index = start
    pivot = a[pivot_index]

    while start<end:
        while start<n and a[start]<=pivot:
            start += 1

        while a[end]>pivot:
            end -= 1

        if start<end:
            a[start],a[end] = a[end],a[start]
    a[end],a[pivot_index] = a[pivot_index],a[end]
    
    return end

def QuickSort(a,start,end):
    if start<end:

        p = partition(a,start,end)

        QuickSort(a,start,p-1)
        QuickSort(a,p+1,end)

print("Input: {0}".format(a))
QuickSort(a,0,n-1)
print("Output: {0}".format(a))