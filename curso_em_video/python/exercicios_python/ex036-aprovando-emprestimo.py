# var salario, trinta_porcento_sal, valor_casa, prestacao: real
# var qtd_anos, qtd_meses: inteiro
valor_casa = float(input("Digite o valor do imóvel que deseja comprar: R$ ")) 
qtd_anos = int(input("Digite em quantos anos deseja pagar o imóvel: "))
salario = float(input("Digite o valor do seu salário: R$ "))
trinta_porcento_sal = salario * 30 / 100
qtd_meses = qtd_anos * 12
prestacao = valor_casa / qtd_meses
if trinta_porcento_sal >= prestacao:
    print(f"Seu empréstimo foi aprovado, parabéns! A prestação fica em {prestacao:.2f}")
else:
    print(f"Empréstimo Negado.")


