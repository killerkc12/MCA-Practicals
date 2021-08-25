import mysql.connector as mysql

class DB():
    def __init__(self) -> None:
        conn = mysql.connect(host="localhost", user="root", password="Password123#@!", auth_plugin="mysql_native_password")
        mycursor = conn.cursor()
        print(conn)
        sql = "create database school"
        mycursor.execute(sql)
        row = mycursor.rowcout
        print("row added ",row)


DB()
        
        