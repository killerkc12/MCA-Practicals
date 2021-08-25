import sys

def shortestDist(graph,stage):
	cost = [0] * N
	d = [0] * N
	path = [0] * stage
	cost[N - 1] = 0
	for i in range(N - 2, -1, -1):
		cost[i] = 0
		minValue = sys.maxsize
		for j in range(N):
			if graph[i][j] == 0:
				continue
			minValue = graph[i][j] + cost[j]
			d[i] = j
		cost[i] = minValue
	path[1] = 0
	path[stage-1] = N
	for i in range(1,stage):
		path[i] = d[path[i-1]]
	return path,cost[0]

N = 8
stage = 4
graph = [[0, 1, 2, 5, 0, 0, 0, 0],
		[0, 0, 0, 0, 4, 11, 0, 0],
		[0, 0, 0, 0, 9, 5, 16, 0],
		[0, 0, 0, 0, 0, 0, 2, 0],
		[0, 0, 0, 0, 0, 0, 0, 18],
		[0, 0, 0, 0, 0, 0, 0, 13],
		[0, 0, 0, 0, 0, 0, 0, 2]]
path, cost = shortestDist(graph,stage)
print("Graph is : ")
for i in range(0,N-1):
	print(graph[i])
print("Stages are : ",stage)
print("Minimum cost is : ",cost)
print("Minimum cost path is : ",path)