class Rectangle():
    def __init__(self, l, w):
        self.length = l
        self.width  = w

    def rectangle_area(self):
        return self.length*self.width

length = float(input("Enter the Length: "))
width = float(input("Ente the Width: "))
newRectangle = Rectangle(length, width)
print("Are of Rectangle is : ",newRectangle.rectangle_area())