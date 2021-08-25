class Circle():
    def __init__(self, r):
        self.radius = r

    def area(self):
        return self.radius**2*3.14
    
    def perimeter(self):
        return 2*self.radius*3.14

radius = 15
NewCircle = Circle(radius)
print("Area of Circle of radius {} is {}".format(radius,NewCircle.area()))
print("Perimeter of circle of radius {} is {}".format(radius,NewCircle.perimeter()))