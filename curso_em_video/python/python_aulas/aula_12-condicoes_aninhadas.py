nome = str(input("Qual é o seu nome? "))
if nome == "Bruno":
    print("Que nome lindo!")
elif nome == "Pedro" or nome == "João" or nome == "Lucas":
    print("Nome biblico é legal.")
elif nome in "Maria Madalena Janete Gorete":
    print("Você é mulher, uau!")
else:
    print("Nome comum também é bonito.")
print(f"Tenha um bom dia, {nome}!")
          