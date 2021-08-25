n1 = int(input("Enter the 1st number: "))
n2 = int(input("Enter the 2nd number: "))

def add(n1,n2):
    print("Add of {0} and {1} is {2}".format(n1,n2,n1+n2))

def sub(n1,n2):
    print("Sub of {0} and {1} is {2}".format(n1,n2,n1-n2))

def mul(n1,n2):
    print("Mul of {0} and {1} is {2}".format(n1,n2,n1*n2))

def div(n1,n2):
    print("Div of {0} and {1} is {2}".format(n1,n2,n1/n2))
k = True
while k == True:
    print("1.Add")
    print("2.Sub")
    print("3.Mul")
    print("4.Div")
    print("5.Exit")
    ch = int(input("Enter the choice: "))
    if(ch == 1): add(n1,n2)
    elif(ch == 2): sub(n1,n2)
    elif(ch == 3): mul(n1,n2)
    elif(ch == 4): div(n1,n2)
    elif(ch == 5): k = False
    else:
        print("Invalid Choice")
        