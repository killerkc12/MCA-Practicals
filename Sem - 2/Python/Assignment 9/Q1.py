import mysql.connector as mysql

# make th connection 
try:
    conn = mysql.connect(host="localhost", user="root", password="Password123#@!", database="assignment9", auth_plugin="mysql_native_password")
    mycursor = conn.cursor()
    print(conn)
except:
    print("Conneciton failed")

#create table
try:
    sql = "create table Employee(eid int(5), name varchar(20), city varchar(20))"
    mycursor.execute(sql)
    print("\nTable is Created Successfully!\n")
except:
    print("\nTable is already Created\n")

# insert record in the table 
try:
    sql = "insert into Employee values(%s,%s,%s)"
    val = [
        (1,"ram","pune"),
        (2,"sham","mumbai"),
        (3,"karan","nashik"),
        (4,"kuldeep","pune")
    ]
    mycursor.executemany(sql,val)
    conn.commit()
    print(mycursor.rowcount," records inserted!")
except:
    print("0 row affected")

# display the record 
try:
    print("\nData from Table : ")
    sql = "select * from Employee"
    mycursor.execute(sql)
    result = mycursor.fetchall()
    for row in result:
        print(row)
    conn.close()
except:
    print("Table not found")