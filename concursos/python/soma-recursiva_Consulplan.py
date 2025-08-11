def soma_recursiva(n):
    if n == 1:
        return 1
    else:
        return n + soma_recursiva(n - 1)

n = int(input("Entre com um valor para soma: "))
resultado = soma_recursiva(n)
print("Resultado =", resultado)
