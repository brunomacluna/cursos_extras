n = int(input("Digite um número: "))
conversor = int(input("Digite [1] para binário, [2] para octal ou [3] para hexadecimal: "))
if conversor == 1:
    binario = bin(n)[2:] # as funções bin(), oct() e hex() transformam os numéro em binario, octal e hexadecimal respectivamente 
    print(f"{n} em Binário é {binario}")
elif conversor == 2:
    octal = oct(n)[2:] # [2:] isso entre cochetes retira os dois primeiros digitos
    print(f"{n} em Octal é {octal}")
elif conversor == 3:
    hexadecimal = hex(n)[2:]
    print(f"{n} em Hexadecimal é {hexadecimal}")
else:
    print("Erro, opção inexistente. Tente novamente.")