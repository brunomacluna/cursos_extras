largura = float(input("Qual é a largura? "))
altura = float(input("Qual é a altura? "))
area = largura * altura
qtdTinta = area / 2
qtdTinta = round(qtdTinta, 2)
print(f"A quantidade de tinta é de {qtdTinta} litros.")