cor_ciano = '\033[36m'
cor_verde = '\033[32m'
cor_amarelo = '\033[33m'
cor_azul = '\033[34m'
cor_magenta = '\033[35m'
resetar_cor = '\033[0m'

valor_1 = int(input(f"{cor_ciano}Digite o primeiro valor: {resetar_cor}"))
valor_2 = int(input(f"{cor_ciano}Digite o segundo valor: {resetar_cor}"))
print()

opcao = 0

while opcao != 5:
    print(f"{cor_ciano}ESCOLHA UMA DAS OPCÕES!!!{resetar_cor}")
    print(f"{cor_verde}[1] Somar {resetar_cor}")
    print(f"{cor_amarelo}[2] Multiplicar {resetar_cor}")
    print(f"{cor_verde}[3] O Maior Número {resetar_cor}")
    print(f"{cor_amarelo}[4] Inserir Novos Números {resetar_cor}")
    print(f"{cor_verde}[5] Sair do Programa {resetar_cor}")
    print()

    opcao = int(input(f"{cor_magenta}Digite a opção desejada: {resetar_cor}"))
    print()
    
    if opcao == 1:
        soma = valor_1 + valor_2
        print(f"{cor_azul}O resultado da soma é: {soma}{resetar_cor}")
        print()
    elif opcao == 2:
        produto = valor_1 * valor_2
        print(f"{cor_azul}A multiplicação é : {produto}{resetar_cor}")
        print()
    elif opcao == 3:
        if valor_1 > valor_2:
            maior = valor_1
            print(f"{cor_azul}O maior valor é: {valor_1}{resetar_cor}")
            print()
        elif valor_1 < valor_2:
            maior = valor_2   
            print(f"{cor_azul}O maior valor é: {valor_2}{resetar_cor}") 
            print()
        else:
            print(f"{cor_azul}O valores são iguais{resetar_cor}")
            print()
    elif opcao == 4:
       print(f"{cor_azul}Redefina os números!{resetar_cor}")
       print()
       valor_1 = int(input(f"{cor_ciano}Digite o primeiro valor: {resetar_cor}"))
       valor_2 = int(input(f"{cor_ciano}Digite o segundo valor: {resetar_cor}"))
       print()
        
    elif opcao == 5:
        print(f"{cor_azul}Obrigado por usar nosso programa!{resetar_cor}")
    else:
        print("Opção inválida. Tente novamente.")    
        print()