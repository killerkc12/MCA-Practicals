dict = [
    {"name":"student1", "python":80,"java":90},
    {"name":"student2", "python":50,"java":70},
    {"name":"student3", "python":100,"java":90},
]

for dic in dict:
    dic['sum'] = dic.pop('python')+dic.pop('java')

print(dict)