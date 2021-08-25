class Power:
   def pow(self, x, n):
        if x==0 or x==1 or n==1:
            return x 

        if x==-1:
            if n%2 ==0:
                return 1
            else:
                return -1
        if n==0:
            return 1
        if n<0:
            return 1/self.pow(x,-n)
        val = self.pow(x,n//2)
        if n%2 ==0:
            return val*val
        return val*val*x

x = int(input("Enter the x :"))
n = int(input("Enter the n : "))

print("Power of {} raised to  {} is {}".format(x,n,Power().pow(x,n)))

# print(Power().pow(2, -3));
# print(Power().pow(3, 5));
# print(Power().pow(100, 0));
