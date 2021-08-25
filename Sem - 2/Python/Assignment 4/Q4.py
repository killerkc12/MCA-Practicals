from datetime import date
from datetime import time
from datetime import datetime
second = 23456789
local_time = time.ctime(second)
print("Local time:", local_time)
time.sleep(2) # prints after specified sec
print("Printed after 2 seconds.")
time1 = time.localtime(576425769) # takes number of sec & return in local time
print("result:", time1)
print("\nYear:", time1.tm_year)
print("Hour:", time1.tm_hour)
now = datetime.now()
timee = now.strftime("%H:%M:%S")
print("Time:", timee)
a1 = now.strftime("%d/%m/%Y, %H:%M:%S")
print("Formatted string is :", a1)
# fromtimestamp()
ts = date.fromtimestamp(1326244364)
print("Convert timestamp() to date :", ts)
time_string = "18 June, 2021"
result = time.strptime(time_string, "%d %B, %Y")
print(result) 