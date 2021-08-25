wt = [10,30,50,20]
value = [150,20,100,80]
capacity = 60

class comparator:

    def __init__(self, wt, value, index) -> None:
        self.wt = wt
        self.value = value
        self.index = index
        self.perc = value // wt

    def __lt__(self,other):
        return self.perc < other.perc


def knapsack(wt, value, capacity):
    val = []
    for i in range(len(wt)):
        val.append(comparator(wt[i],value[i],i))

    val.sort(reverse=True)

    total = 0
    for i in val:
        curWt = int(i.wt)
        curValue = int(i.value)
        if capacity - curWt >= 0:
            capacity -= curWt
            total += curValue
        else:
            fraction = capacity / curWt
            total += fraction * curValue
            capacity = int(capacity - (curWt * fraction))
            break
    return total

total = knapsack(wt, value, capacity)
print("Weigths = ",wt)
print("Values = ",value)
print("Capacty is ",capacity)
print("Total value for capacity {} is {}".format(capacity,total))