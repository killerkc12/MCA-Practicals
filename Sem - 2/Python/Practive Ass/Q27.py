from os import PRIO_PGRP
from shutil import copyfile
copyfile('test.txt', 'abc.txt')
print("copied")
file = open("abc.txt",'r')
print("Data in the abc.txt file is :")
print(file.read())