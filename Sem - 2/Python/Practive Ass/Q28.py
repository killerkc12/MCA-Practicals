class py_solution:
    def reverse_words(self, s):
        return ' '.join(reversed(s.split()))

str = "python programming"
print("Strin is : ",str)
print("Reversed words are : ",py_solution().reverse_words(str))
