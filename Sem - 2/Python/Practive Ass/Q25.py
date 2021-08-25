from heapq import nlargest
from operator import itemgetter
items = {'item1': 70.50, 'item2':95, 'item3': 41.30, 'item4':75, 'item5': 44}
for name, value in nlargest(3, items.items(), key=itemgetter(1)):
    print(name, value)
	