x = frozenset([1, 2, 3, 4, 5])
y = frozenset([3, 4, 5, 6, 7])
#new set with elements from both x and y
print(x | y)

# creating a dictionary
Student = {"name": "Ankit", "age": 21, "sex": "Male",
		"college": "MNNIT Allahabad", "address": "Allahabad"}

# making keys of dictionary as frozenset
key = frozenset(Student)

# printing keys details
print('The frozen set is:', key)
