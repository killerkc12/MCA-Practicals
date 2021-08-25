import datetime
import calendar
from datetime import date

print("2021 year Calender")
year_cal = calendar.prcal(2021) 

print("2021 July Calender")
calender = calendar.month(2021, 7) 

print("Current date and time", datetime.datetime.now()) 
print("pecified date: ",datetime.datetime(2020, 4, 4)) 
print("Print specified date:", datetime.datetime(2020, 4, 4, 1, 26, 40)) 

dtoday = date.today()
print("Current date :", dtoday)
print("Current year:", dtoday.year)
print("Current month:", dtoday.month)
print("Current day:", dtoday.day)
from datetime import datetime
date_time = datetime(2021, 6, 18) 
print("Date and Time is(when time is not mentioned)", date_time) 