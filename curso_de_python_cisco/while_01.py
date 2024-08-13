# largets_number = -99999999 serve para que qualquer número possa ser colocado no lugar.
# O maior número sempre será atualizado aqui.
largest_number = -999999999

# Insira o primerio valor.
number = int(input("Digite um número ou digite -1 para parar: "))

# Se o número não for igual a -1, continue(o while que faz continuar)
while number != -1:
     # O número é maior que o maior_número?
     # Sim, atualize o maior_número.
    if number > largest_number:
        # if tbm faz continuar o loop
        largest_number = number
    # Insira o próximo número.
    number = int(input("Digite um número ou digite -1 para parar: "))
 
# Imprima o maior número.
print("O maior número é:", largest_number)