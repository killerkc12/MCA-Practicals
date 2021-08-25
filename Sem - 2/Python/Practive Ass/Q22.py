import collections
ship = [("NAME", "Albatross"),
        ("HP", 50),
        ("BLASTERS", 13),
        ("THRUSTERS", 18),
        ("PRICE", 250)]
ship = collections.OrderedDict(ship)
print(ship)