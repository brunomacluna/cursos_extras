print("Calcule o seu Indice de Massa Corporal.")
peso = float(input("Digite seu peso: (kg) "))
altura = float(input("Digite sua altura: (m) "))
imc = peso / (altura ** 2)

if imc < 18.5:
    print(f"{imc:.2f} = Perigo, abaixo do peso.")
elif imc >= 18.5 and imc < 25:
    print(f"{imc:.2f} = Peso normal.")
elif imc >= 25 and imc < 30:
    print(f"{imc:.2f} = Cuidado, sobrepeso.")
elif imc >=30 and imc < 40:
    print(f"{imc:.2f} = Perigo, obesidade.")
elif imc >= 40:
    print(f"{imc:.2f} = Urgente, obesidade morbida.")