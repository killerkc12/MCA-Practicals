class Vehicle:
    def __init__(self,maxSpeed,mileage):
        self.maxSpeed = maxSpeed
        self.mileage = mileage

maxSpeed = int(input("Enter the Max Speed: "))
mileage = int(input("Enter the Mileage: "))
v = Vehicle(maxSpeed,mileage)
print("Max Speed is :",v.maxSpeed)
print("Mileage is : ",v.mileage)