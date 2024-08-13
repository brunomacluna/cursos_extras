salario = float(input("Digite o sálario: "))
imposto = (salario * 15) / 100 
impostoVista = imposto - (imposto * 3) / 100
impostoVista = round(impostoVista, 2)
impostoParc = imposto / 3
impostoParc = round(impostoParc, 2)
print(f"A vista: {impostoVista}\nParecelado: 3x {impostoParc}" )