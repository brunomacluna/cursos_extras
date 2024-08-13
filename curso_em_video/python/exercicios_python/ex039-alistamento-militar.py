from datetime import date
print("Verifique sua situação com o serviço militar.")
print("Digite [h] para homem e [m] para mulher")

pessoa = str(input("h/m: ")).lower()

if pessoa == "m":
    print("Mulheres não são obrigadas ao serviço militar.")
    print("Será bem vida caso queria ingressar via concurso público.")
    print("Agradecemos seu interesse!")

elif pessoa == "h": 
    nascimento = int(input("Em que ano você nasceu? ")) 
    ano_atual = date.today().year
    idade = ano_atual - nascimento
    qtd_falta = 18 - idade
    qtd_passou = idade - 18
    ano_de_listamento = nascimento + 18
    print(f"Em {ano_atual} quem nasceu em {nascimento} tem {idade} anos.")
    if idade < 18:
        print(f"Você deve se alistar em {qtd_falta} ano/anos.")
    elif idade == 18:
        print(f"Está na hora de se alistar, procure a junta militar mais próxima.")
    elif idade > 18:
        print(f"Você já passou da idade de servir a {qtd_passou} ano/anos atrás.")
        print(f"Deveria ter se alistado em {ano_de_listamento}")
