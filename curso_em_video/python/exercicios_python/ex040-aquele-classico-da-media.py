# Programa média
nota1 = float(input("Digite sua primeira nota, use ponto: "))
nota2 = float(input("Digite a segunda nota, use ponto: "))
media = (nota1 + nota2) / 2
print(f"Sua média foi de: {media}")
if media < 5:
    print("REPROVADO")
elif media >= 5 and media <= 6.9:
    print("RECUPERAÇÂO")
elif media > 6.9:
    print("APROVADO")