class Parenthesis:
   def isValidParenthese(self, str):
        stack, pchar = [], {"(": ")", "{": "}", "[": "]"}
        for parenthese in str:
            if parenthese in pchar:
                stack.append(parenthese)
            elif len(stack) == 0 or pchar[stack.pop()] != parenthese:
                return "Invalid"
        return "Valid"

print(Parenthesis().isValidParenthese("(){}[]"))
print(Parenthesis().isValidParenthese("()"))
print(Parenthesis().isValidParenthese("()[{)}"))
print(Parenthesis().isValidParenthese("()[{)"))