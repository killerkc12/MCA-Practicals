class Vehicle:
    def __init__(self, capacity):
        self.capacity = capacity

    def fare(self):
        return self.capacity * 100

class Bus(Vehicle):
    
    def fare(self):
        fare_car = self.capacity * 100 
        total_fare = fare_car + (0.1 *fare_car)
        return total_fare

input = int(input("Enter the capacity: "))
School_bus = Bus(input)
print("Total Bus fare is:", School_bus.fare())