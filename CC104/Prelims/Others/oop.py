class Vehicle:
    def __init__(self, color, mileage):
        self.color = color
        self.mileage = mileage

    def __str__(self):
        return f"Color: {self.color}\nMileage: {self.mileage} miles\n"


mazda = Vehicle("Black", 50000)
chevrolet = Vehicle("Purple", 80000)

print(mazda)
print(chevrolet)
