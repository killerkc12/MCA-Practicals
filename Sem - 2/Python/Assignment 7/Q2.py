class twoSum:
    def findIndexes(self,array,target):
        for i,ar in enumerate(array):
            for j,arr in enumerate(array):
                if (ar+arr) == target:
                    return i,j
                    break

array = (1,3,5,3,6,3)
target = int(input("Enter the Target: "))
ts = twoSum()
i,j = ts.findIndexes(array,target)
print("index :",i," and index ",j)