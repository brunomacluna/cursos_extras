numero = soma = 0 # posso iniciar a variáveis com o mesmo valor na mesma linha
while True: # loop infinito
    numero = int(input("Digite um número: "))
    if numero == 999:
        break # interrompe o loop infinito
    soma += numero
print(f"A soma de todos o números é = {soma}")