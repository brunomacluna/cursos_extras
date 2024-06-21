distancia = float(input("Digite é a distância: "))
print(f"Sua viagem de {distancia} Km está começando.")
if distancia <= 200:
    print(f"Sua passagem custa R${distancia * 0.50:.2f}.")
else:
    print(f"Sua passagem custa R${distancia * 0.45:.2f}.")