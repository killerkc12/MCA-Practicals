import mysql.connector as mysql

# make th connection 
try:
    conn = mysql.connect(host="localhost", user="root", password="Password123#@!", database="assignment9", auth_plugin="mysql_native_password")
    mycursor = conn.cursor()
    print(conn)
except:
    print("Conneciton failed")

# display the record before alter
try:
    sql = "desc Employee"
    mycursor.execute(sql)
    print("\nTable Structure before alter :")
    result = mycursor.fetchall()
    for col in result:
        print(col)
except:
    print("Table not found")

# insert record in the table 
try:
    sql = "alter table Employee add column class varchar(20)"
    mycursor.execute(sql)
    conn.commit()
    print("table altered!")
except:
    print("Table not affected")

# display the record after alter
try:
    sql = "desc Employee"
    mycursor.execute(sql)
    print("\nTable Structure after alter :")
    result = mycursor.fetchall()
    for col in result:
        print(col)
except:
    print("Table not found")