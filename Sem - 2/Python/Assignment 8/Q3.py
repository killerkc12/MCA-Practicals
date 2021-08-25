class ReversedClass:
    def reverse_words(self, s):
        return ' '.join(reversed(s.split()))

str = input("Enter the String : ")
print("Reversed of {} : {}".format(str, ReversedClass().reverse_words(str)))