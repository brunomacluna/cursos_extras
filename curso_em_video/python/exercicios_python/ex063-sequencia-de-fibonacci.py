lista = [0, 1]
penultimo = 0
ultimo = 1
fibo = 0
termos = int(input("Digite quantos termos da sequência de Fibonacci você quer ver: "))
print(f"{penultimo} → {ultimo} →", end=" ")
while (termos -2 ) > 0:
    print(f"{penultimo + ultimo} →",end=" ")
    fibo = penultimo + ultimo
    lista.append(fibo)
    penultimo = ultimo
    ultimo = fibo
    termos -= 1

print("FIM")
qtd_lista = len(lista)
print(f"Há exatamente {qtd_lista} termos de Fibonacci.")