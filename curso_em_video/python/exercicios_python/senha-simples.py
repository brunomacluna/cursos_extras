reset_cor = '\033[0m'
vermelho = '\033[31m'
roxo = '\033[34m'
verde = '\033[32m'
amarelo = "\033[33m"
azul = "\033[36m"
magenta = "\033[35m"
branco = "\033[37m"
preto = "\033[30m"

print()

while (True):
    verificacao_1 = str(input("Defina uma senha usando letra e números: ")).upper()
    print()
    verificacao_2 = str(input("Repita a mesma senha novamente: ")).upper()
    if verificacao_1 == verificacao_2:
        senha_atual = verificacao_2
        print()
        print(f"{azul}Senha criada com sucesso.{reset_cor}")
        break
    else:
        print(f"{vermelho}Senha incorreta.{reset_cor}")

print(f"{amarelo}")
print(11 * "=")
print("ATENÇÃO!!!")
print(11 * "=")
print(reset_cor)
print()
print(f"{roxo}Acesso autorizado somente mediante senha.{reset_cor}")
print()

for i in range(1, 4):
    validacao = str(input("Digite sua senha: "))
    if validacao == senha_atual:
        print(verde)
        print(16 * "=")
        print(f"Acesso liberado!")
        print(16 * "=")
        print(reset_cor)
        break
    elif i == 2 and validacao != senha_atual:
        print()
        print(f"{amarelo}Atenção!, Se você errar a senha mais uma vez sua conta será BLOQUEADA!!!{reset_cor}")
        print()
    elif i == 3 and validacao != senha_atual:
        print()
        print(f"{vermelho}CONTA BLOQUEADA!!!{reset_cor}")
        print()
        print(f"{magenta}Entre em contado com o suporte.{reset_cor}")
        print()

