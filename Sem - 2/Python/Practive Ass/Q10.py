def add_string(str):
  if len(str) > 2:
    if str[-3:] == 'ing':
      str += 'ly'
    else:
      str += 'ing'

  return str

str = str(input("Enter the String : "))
print(add_string(str))