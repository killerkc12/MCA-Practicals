filename = "python.txt"
file = open(filename,"a+")
data = "\nThis is IE2 practical exam"
file.write(data)

file = open(filename,"r")
print("\n Data from File : ")
print(file.read())