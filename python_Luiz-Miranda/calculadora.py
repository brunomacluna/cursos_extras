while True:
   numero_1_str = input("Digite o primeiro número: ")
   operador_str = input("Digite o operador [+][-][*][/]: ")
   numero_2_str = input("Digite o segundo número: ")

   numeros_validos = None
   numero_1 = 0
   numero_2 = 0

   try:
      numero_1 = float(numero_1_str)
      numero_2 = float(numero_2_str)
      numeros_validos = True
   except:
      numeros_validos = None

   if numeros_validos is None:
      print("Um ou ambos os números são inválidos.")
      print()
      continue

   operadores_validos = "+-*/"
   if operador_str not in operadores_validos:
      print("Operador inválido.")
      print()
      continue

   if len(operador_str) > 1:
      print("Digite apenas um operador.")
      print()
      continue

   if operador_str == "+":
      print(f"{numero_1} + {numero_2} = {numero_1 + numero_2}")
   elif operador_str == "-":
      print(f"{numero_1} - {numero_2} = {numero_1 - numero_2}")
   elif operador_str == "*":   
      print(f"{numero_1} x {numero_2} = {numero_1 * numero_2}")
   else:   
      print(f"{numero_1} / {numero_2} = {numero_1 / numero_2}")


   sair = input("Deseja sair? [s] ou [n]: ").lower().startswith("s")
   print()
   if sair:
     break
   