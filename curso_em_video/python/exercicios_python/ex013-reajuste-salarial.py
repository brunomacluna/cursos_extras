antigoSal = float(input("Digite seu sálario: R$"))
aumento = antigoSal + (antigoSal * 15) / 100
print(f"Seu novo sálario é: R${aumento:.2f}") # para colocar o round direto no print basta :.2f , sendo o 2 o numero de casa após a virgula
