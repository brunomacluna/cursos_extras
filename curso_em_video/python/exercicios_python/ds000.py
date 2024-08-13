# Programa Juros
# A vista tem 10% de desconto.
# Em 2 vezes tem fica sem juros.
# Em 5 vezes tem juros de 5.89%

produto = float(input("Digite o valor do porduto: R$"))
vista = produto - (produto * 10 / 100)
duasVezes = produto / 2
percentCinco = (produto * 5.89 / 100) + produto 
cincoVezes = percentCinco / 5
print(f"A vista fica em R${vista:.2f} \nOu em 2x de R${duasVezes:.2f} sem juros. \nOu em 5x de R${cincoVezes:.2f} com acrescimo de 5.89%.")
