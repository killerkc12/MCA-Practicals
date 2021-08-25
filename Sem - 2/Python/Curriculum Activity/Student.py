import tkinter as tk
class StudentClass(tk.Tk):
    def __init__(self) -> None:
        super().__init__()
        self.title("Student Management System")
        self.geometry("800x800+350+150")
        self.lblTitle = tk.Label(self, text="Student Management System", font=("Arial",18), bg="pink", fg="black")