import string
n = int(input("Enter the number of letter for each line: "))
with open("alphabets.txt", "w") as f:
       alphabet = string.ascii_uppercase
       letters = [alphabet[i:i + n] + "\n" for i in range(0, len(alphabet), n)]
       f.writelines(letters)

file = open("alphabets.txt",'r')
print(file.read())
