from Student import StudentClass
from db import DB


if __name__== "__main__":
    app = StudentClass()
    db = DB()
    app.mainloop()