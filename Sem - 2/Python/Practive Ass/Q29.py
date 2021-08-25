class Rectangle():
    def __init__(self, l, w):
        self.length = l
        self.width  = w

    def rectangle_area(self):
        return self.length*self.width

height = 25
width = 20
newRectangle = Rectangle(height, width)
print("Area of Ractang of height {} and width {} is {}".format(height,width,newRectangle.rectangle_area()))
