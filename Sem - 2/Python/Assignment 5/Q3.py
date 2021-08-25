class invalidClass(Exception):
    pass
classs = input("Enter the Class name: ")
if(classs == 'FYMCA' or classs == 'SYMCA'):
    print("Correct!!!")
else:
    raise invalidClass