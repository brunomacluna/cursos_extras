
print(37 * "=")
numero = int(input("Digite um número a ser Fatorado: "))
resultado = 1
while numero > 1:
    resultado *= numero 
    numero -= 1
    print(14 * "=")
    print(f"{resultado} x {numero} = {resultado * numero}")
    print(14 * "=")
   


print(f"O Fatorial é {resultado} ")