def change_char(str):
  char = str[0]
  str = str.replace(char, '$')
  str = char + str[1:]

  return str

str = str(input("Enter the String : "))
print(change_char(str))

# concurrences