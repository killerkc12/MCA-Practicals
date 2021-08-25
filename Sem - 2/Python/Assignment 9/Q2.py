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
    print("All Records before update :")
    result = mycursor.fetchall() 
    for row in result:
        print(row)
except:
    print("Table not found")

# insert record in the table 
try:
    name = input("Enter the Employee name: ")
    city = input("Enter updated City: ")
    sql = "update Employee set city=%s where name=%s"
    val = (city, name)
    mycursor.execute(sql,val)
    conn.commit()
    print(mycursor.rowcount," records updated!")
except:
    print("0 row affected")

# display the record after update
try:
    sql = "select * from Employee"
    mycursor.execute(sql)
    print("All Records after update :")
    result = mycursor.fetchall()
    for row in result:
        print(row)
    conn.close()
except:
    print("Table not found")