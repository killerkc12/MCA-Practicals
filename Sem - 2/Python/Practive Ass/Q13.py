def countStrings(list):
    count = 0
    for str in list:
        if len(str) > 2 and str[0] == str[-1]:
            count += 1
    return count

list = ['kiran','man','naman','helloh']
print("List of strings is ",list)
print("Number of strings are : ",countStrings(list))