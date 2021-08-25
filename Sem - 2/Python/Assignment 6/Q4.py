with open('sample.txt') as file:
    data=file.read().split()
    max=len(max(data,key=len ))
    res=[word for word in data if len(word)==max]
    print("Longest word in the file is : ",res)