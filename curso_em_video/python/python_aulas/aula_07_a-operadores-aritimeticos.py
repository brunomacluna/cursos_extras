n1 = int(input("Um valor: "))
n2 = int(input("Outro valor: "))
s = n1 + n2
m = n1 * n2
d = n1 / n2 
d = round(d, 2)
di = n1 // n2
e = n1 ** n2 
print(f"A soma é {s}, o produto é {m} e a divisão é {d},", end="")
print(f" a divisão inteira é {di} e a potênciação é {e}.") 