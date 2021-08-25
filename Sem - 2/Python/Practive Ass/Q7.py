def charFrequency(str):
    dict = {}
    for ch in str:
        keys = dict.keys()
        if ch in keys:
             dict[ch] += 1
        else:
            dict[ch] = 1
        
    return dict

str = "hello world"
print("Number of characters (character frequency) in a string of {}: ".format(str))
print(charFrequency(str))
