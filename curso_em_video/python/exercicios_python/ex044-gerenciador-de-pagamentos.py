print("Escolha a forma de pagamento mais adquada para o seu bolso, Uuuooollll!!")
valor = float(input("Digite o valor da sua compra: R$"))
pagamento = str(input("Digite a forma de pagamento: \n[1] dinheiro\n[2] pix\n[3] debito ou crétido a vista\n[4] 2x ou mais no crédito\nOpção: "))
if pagamento == "1" or pagamento == "2":
    total = valor - (valor * 10 / 100)
    print(f"Com um desconto de 10% o total fica em: R${total:.2f}")
elif pagamento == "3":
    total = valor - (valor * 5 / 100)
    print(f"Com um desconto de 5% o total fica em: R${total:.2f}")
elif pagamento == "crédito 2x":
    total = valor / 2
    print(f"2x no crédito fica em duas parcelas sem juros de: R${total:.2f}") 
elif pagamento == "4":
    parcelas = int(input("Digite o número de parcelas no crédito: "))
    mensalidades = (valor + (valor * 20 / 100)) / parcelas
    total = (valor + (valor * 20 / 100))
    print(f"Parcelado com juros o total fica em R${total:.2f}, são {parcelas} parcelas de R${mensalidades:.2f}")
else:
    print("Opção INVÁLIDA, tente novamente.")
