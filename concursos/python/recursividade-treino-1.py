def funcao(x):
    print(f"Chamando funcao({x})")
    if x <= 1:
        return 1
    else:
        resultado = x + (funcao(x - 1) * funcao(x - 2))
        print(f"funcao({x}) = {resultado}")
        return resultado

x = int(input("Entre com um valor: "))
resultado = funcao(x)
print("Resultado final =", resultado)

