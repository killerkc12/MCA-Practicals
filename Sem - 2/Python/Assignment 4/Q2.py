import math

n = 10.5
n1 = 5
n2 = 10

print("Ceil of {} is {}".format(n,math.ceil(n)))
print("Floor of {} is {}".format(n,math.floor(n)))
print("Absolute Value of {} is {}".format(n,math.fabs(n)))
print("Factorial of {} is {}".format(n1,math.factorial(n1)))
print("Remainder of {} and {} is {}".format(n1, n2,math.fmod(n1,n2)))
print("Expression of {} is {}".format(n1,math.exp(n1)))
print("montissa and exponenet of {} is {}".format(n1,math.frexp(n1)))
print("Log10 of {} is {}".format(n1,math.log10(n1)))
print("GCD of {} and {} is {}".format(n1, n2, math.gcd(n1,n2)))
print("IsClose of {} and {} is {}".format(n1, n2, math.isclose(n1,n2)))
print("IsFinite of {} is {}".format(n1,math.isfinite(n1)))
print("Isqrt of {} is {}".format(n1,math.isqrt(n1)))
print("e raised to the power of {} is {}".format(n1,math.exp(n1)))
print("{} raise to {} is {}".format(n1,n2,math.pow(n1,n2)))
print("Square root of {} is {}".format(n1,math.sqrt(n1)))
print("Isqrt of {} is {}".format(n1,math.isqrt(n1)))

print("\n=====Trigonometric Functions=====")
print("Sine function: math.sin((math.pi)/2)): ", math.sin((math.pi)/2))
print("cosine function: math.cos((math.pi)/2)): ", math.cos((math.pi)/2))
print("Angular conversion from Degree to Radian: ", math. degrees(math.pi))
print("Angular conversion from Radian to Degree: ", math. radians(180))
print("\n=======Hyperbolic Functions=======")
print("Inverse hyperbolic Cosine of x: math.acosh(180)", math.acosh(180))
print("Inverse hyperbolic Sine of x: math.asinh(180)", math.acosh(180)) 