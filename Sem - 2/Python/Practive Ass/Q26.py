import os

# create the file 
file = open('crudfile.txt','w')
file.write("This is the CRUD operation file")
print("File created Successfully!\n")

# Read the file 
file = open('crudfile.txt','r')
print("File data is :")
print(file.read())

# Update the file 
file = open('crudfile.txt','a')
file.write("\nThis is the update file data")
print("\nFile data after update :")
file = open('crudfile.txt','r')
print(file.read())

# Delete the file 
os.remove('crudfile.txt')
print("\nfile is deleted")