from os import read
import mysql.connector as mysql

# connection 
conn = mysql.connect(host="localhost", user="root", password="Password123#@!", auth_plugin="mysql_native_password")
print(conn)
mycursor = conn.cursor()

# delete database 
sql = "drop database pycrud"
result = mycursor.execute(sql)
print("Database deleted successfully!")

# create database 
sql = "create database pycrud"
result = mycursor.execute(sql)
print("Database created successfully!")

# choose database
sql = "use pycrud"
mycursor.execute(sql)
print("pycrud database is using")

# create table
sql = "create table Student(rollno int,name varchar(20), class varchar(10))"
mycursor.execute(sql)
print("Table created successfully")

# insert data in the table
sql = "insert into Student values(%s,%s,%s)"
val = [(1,"viraj","FYMCA"),(2,"sudesh","SYMCA"),(3,"karan","FYMCA"),(4,"naman","TYMCA")]
for i in val:
    mycursor.execute(sql,i)
print(mycursor.rowcount," rows inserted")

# Read operation 
def readOperation():
    sql = "select * from Student"
    mycursor.execute(sql)
    result = mycursor.fetchall()
    print("Student data is ;")
    for row in result:
        print(row)
readOperation()

# update operation
sql = "update Student set class=%s where rollno=%s"
val = ("NYMCA",1)
mycursor.execute(sql,val)
print("Data updated successfully")
print("Data after updated: ")
readOperation()

# delete operation 
def deleteOperation():
    sql = "delete from Student where rollno=2"
    mycursor.execute(sql)
    print(mycursor.rowcount, " row deleted successfully")
deleteOperation()
print("Data after deleting the roll no 2")
readOperation()
