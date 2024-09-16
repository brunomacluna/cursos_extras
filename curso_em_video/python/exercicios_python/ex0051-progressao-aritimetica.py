print(57 * "-")
a1 = int(input("Digite o primeiro termo de uma Progressão Aritmética: "))
print(57 * "-")
r = int(input("Digite qual é a razão dessa PA: "))
print(57 * "-")
print(f"Os 10 primeiros termos da PA de {a1} com a razão de {r}")
print(57 * "-")
for c in range(1,11):
    print(a1, end=" ")
    a1 = a1 + r
    
