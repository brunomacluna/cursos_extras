soma_idade = 0
older_man = 0
older_idade = 0
mulheres_jovens = 0

for i in range(1, 5):
    print(f"----- {i}ª PESSOA -----")
    pessoa = str(input("Nome: ")).strip()
    idade = int(input("Idade: "))
    sexo = str(input("Sexo [M/F]: ")).upper().strip()
   
    soma_idade += idade

    if sexo == "M" and older_idade < idade:
        older_idade = idade
        older_man = pessoa

    if sexo == "F" and idade < 20:
        mulheres_jovens += 1

media_idade = soma_idade / 4

print(f"A média do grupo é {media_idade}.")    
print(f"O nome do homem mais velho é {older_man}, ele tem {older_idade} anos.")
print(f"Há {mulheres_jovens} mulheres com menos de 20 anos.")