lista = [0, 1]
penultimo = 0
ultimo = 1
numero = int(input("Digite um número: "))
termos = int(input("Digite quantos termos de Fibonacci você quer: "))
print(f"{penultimo} {ultimo}", end=" ")
while termos > 0:
    print(f"{penultimo + ultimo}", end=" ")
    fibo = penultimo + ultimo
    lista.append(fibo)
    penultimo = ultimo
    ultimo = fibo
    termos -= 1
print()

menor_diferenca = int(999999999999999)
fibo_mais_proximo = None
for i in lista:
    diferenca = abs(numero - i)
    if diferenca < menor_diferenca:
        menor_diferenca = diferenca
        fibo_mais_proximo = i

print(f"O número de Fibonacci mais próximo a {numero} é {fibo_mais_proximo}")