print("Soma de todos os ímpares divisivéis por 3 entre 1 e 500.")
soma = 0
contador = 0
for c in range(1, 500):
    if c % 3 == 0 and c % 2 != 0:
        contador = contador + 1 
        soma = soma + c
        total = soma
print(f"O total de números ímpares divisivéis por 3 é : {contador} e a soma deles é: {total}")