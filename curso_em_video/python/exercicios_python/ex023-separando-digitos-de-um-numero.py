num = int(input("Digite até 4 numeros: "))
m = num // 1000 % 10 # COMO EU IA SABER UMA PORRA DESSA?
c = num // 100 % 10
d = num // 10 % 10
u = num // 1 % 10
print(f"Analisando o número {num}.")
print(f"Milhar: {m}")
print(f"Centena: {c}")
print(f"Dezena: {d}")
print(f"Unidade: {u}")