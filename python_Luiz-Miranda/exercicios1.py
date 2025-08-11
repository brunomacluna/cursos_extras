"""
Faça um programa que peça ao usuário para digitar um número inteiro,
informe se este número é par ou ímpar. Caso o usuário não digite um número
inteiro, informe que não é um número inteiro.
"""
while True:
    numero_str = input("Digite um número: ")
    try:
        numero = int(numero_str)
        break
    except:
        print("Digite apenas números inteiros.")

if numero % 2 == 0:
    print(f"O {numero = } é par.")
else:
    print(f"O {numero = } é impar.")
print()
"""
Faça um programa que pergunte a hora ao usuário e, baseando-se no horário 
descrito, exiba a saudação apropriada. Ex. 
Bom dia 0-11, Boa tarde 12-17 e Boa noite 18-23.
"""
hora = None
while True:
    hora_str = input("Digite que horas são: ")
    try:
        hora = int(hora_str) 
        if 0 <= hora <= 23:
            break
        else:
             print("Vá de 0 a 23 horas.")
    except:
        print("Digite apenas números inteiros.")
if hora <= 11:
    print(f"Agora são {hora} horas, Bom dia!")
elif hora >= 12 and hora <= 17:
    print(f"Agora são {hora} horas, Boa tarde!")
else:
    print(f"Agora são {hora} horas, Boa noite!")
print()    
"""
Faça um programa que peça o primeiro nome do usuário. Se o nome tiver 4 letras ou 
menos escreva "Seu nome é curto"; se tiver entre 5 e 6 letras, escreva 
"Seu nome é normal"; maior que 6 escreva "Seu nome é muito grande". 
"""
while True:
    nome = input("Digite seu nome: ")
    total_letras = len(nome)

    if total_letras > 1:
            if total_letras <= 4:
                print(f"{nome} seu nome é curto.")
                break
            elif 5 <= total_letras <= 6:
                print(f"{nome} seu nome é normal.")
                break
            else:
                print(f"{nome} seu nome é muito grande.") 
                break
    else:
        print("Digite mais de uma letra.")   
