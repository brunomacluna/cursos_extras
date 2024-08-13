reais = float(input("Quantos reais você tem? R$"))
dolar = float(input("Quanto está o dolar hoje? "))
qtdDolar = reais / dolar
qtdDolar = round(qtdDolar, 2)
print(f"Você pode comprar U${qtdDolar}.")