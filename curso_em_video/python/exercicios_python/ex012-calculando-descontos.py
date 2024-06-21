produto = float(input("Digite o valor do produto: R$"))
prodDesconto = produto - (produto * 5 / 100)
prodDesconto = round(prodDesconto, 2)
print(f"Com desconto fica R${prodDesconto}.")