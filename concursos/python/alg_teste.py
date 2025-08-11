x = 4
y = 4
z = 2
if x != y:
    y = y + 2
    if y != z:
        print("A")
    else:
        print("B")
else:
    z = z + 2
    if x != z:
        print("C")
    else:
        print("D")


