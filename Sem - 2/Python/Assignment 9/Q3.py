import mysql.connector as mysql

# make th connection 
try:
    conn = mysql.connect(host="localhost", user="root", password="Password123#@!", database="assignment9", auth_plugin="mysql_native_password")
    mycursor = conn.cursor()
    print(conn)
except:
    print("Conneciton failed")

# display the record before delete
try:
    sql = "select * from Employee"
    mycursor.execute(sql)
    print("\nAll Records before delete :")
    result = mycursor.fetchall()
    for row in result:
        print(row)
except:
    print("Table not found")

# insert record in the table 
try:
    eid = int(input("\nEnter Employee id to delete : "))
    sql = "delete from Employee where eid={}".format(eid)
    mycursor.execute(sql)
    conn.commit()
    print(mycursor.rowcount," record deleted!")
except:
    print("0 row affected")

# display the record after delete
try:
    sql = "select * from Employee"
    mycursor.execute(sql)
    print("\nAll Records after delete :")
    result = mycursor.fetchall()
    for row in result:
        print(row)
except:
    print("Table not found")