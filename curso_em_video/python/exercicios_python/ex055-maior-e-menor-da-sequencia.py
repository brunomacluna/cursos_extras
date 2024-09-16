peso_max = 0
peso_min = 999
for i in range(1, 6):
    peso = float(input(f"{i}º pessoa, digite seu peso: "))
   
    if peso_max < peso:
       peso_max = peso
    if peso_min > peso:
        peso_min = peso

print(f"O peso máximo é {peso_max}")
print(f"O peso mínimo é {peso_min}")
