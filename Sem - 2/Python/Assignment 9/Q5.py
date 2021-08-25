import mysql.connector as mysql

# make th connection 
try:
    conn = mysql.connect(host="localhost", user="root", password="Password123#@!", database="assignment9", auth_plugin="mysql_native_password")
    mycursor = conn.cursor()
    print(conn)
except:
    print("Conneciton failed")

# display the record before update
try:
    sql = "select * from Employee"
    mycursor.execute(sql)
    print("\nAll Records before update :")
    result = mycursor.fetchall()
    for row in result:
        print(row)
except:
    print("Table not found")

# insert record in the table 
try:
    eid = int(input("\nEnter Employee id to update : "))
    # name, city, Class = input("Enter the Name, City, Class: ").split()
    name = input("Enter the name: ")
    city = input("Enter the City: ")
    Class = input("Enter the Class: ")
    sql = "update Employee set name=%s, city=%s, class=%s where eid=%s"
    val = (name,city,Class,eid)
    mycursor.execute(sql,val)
    conn.commit()
    print(mycursor.rowcount," record updated!")
except TypeError as e :
    print(e)
    print("0 row affected")

# display the record after update
try:
    sql = "select * from Employee"
    mycursor.execute(sql)
    print("\nAll Records after update :")
    result = mycursor.fetchall()
    for row in result:
        print(row)
except:
    print("Table not found")