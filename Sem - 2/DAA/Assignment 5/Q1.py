def knapSack(W, wt, val, n):

	# Base Case
	if n == 0 or W == 0:
		return 0

	if (wt[n-1] > W):
		return knapSack(W, wt, val, n-1)

	else:
		return max(
			val[n-1] + knapSack(
				W-wt[n-1], wt, val, n-1),
			knapSack(W, wt, val, n-1))

val = [3, 4, 5, 6]
wt = [2, 3, 4, 5]
W = 5
n = len(val)
profit = knapSack(W, wt, val, n)
print("Value : ",val)
print("Weights : ",wt)
print("Capacity : ",W)
print("Maximum Profit is ",profit)