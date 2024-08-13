print("Escolha a forma de pagamento mais adquada para o seu bolso, Uuuooollll!!")
valor = float(input("Digite o valor da sua compra: "))
pagamento = str(input("Digite a forma de pagamento(dinheiro, pix, debito, crédito 1x ou parcelado): "))
if pagamento == "dinheiro" or pagamento == "pix":
    total = valor - (valor * 10 / 100)
    print(f"Total: {total:.2f}")
elif pagamento == "debito":
    total = valor - (valor * 5 / 100)
    print(f"Total: {total:.2f}")
elif pagamento == "crédito 1x":
    total = valor / 2
    print(f"Total: {total:.2f}") 
elif pagamento == "parcelado":
    parcelas = int(input("Digite o número de parcelas no crédito: "))
    total = (valor + (valor * 20 / 100)) / parcelas
    print(f"São {parcelas} parcelas de {total:.2f}")
