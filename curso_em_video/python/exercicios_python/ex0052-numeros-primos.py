numero = int(input("Digite um número: "))
total = 0
for i in range(1, numero + 1):
    if numero % i == 0: # se o número for divisivél por algum número anterior na lista não será primo, com exceção dele mesmo ou por 1
        print('\033[32m', end=" ") # código da cor verde
        total += 1
    else:
        print('\033[31m', end=" ") # código da cor vermelha
    print(i, end=" ")
    
print('\n\033[m') # código para cancelar as cores

print(f"O número {numero} foi divisível {total} vezes por seus antecessores.")
if total == 2:
    print("Portanto ele é primo!")
else:
    print("Portanto ele não é primo!")