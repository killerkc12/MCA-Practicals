def string_both_ends(str):
  if len(str) < 2:
    return 'Empty String'

  return str[0:2] + str[-2:]

str = str(input("Enter the String: "))
print(string_both_ends(str))
