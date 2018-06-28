##velocidade inicial (em m/s)
print("Digite a velocidade inical em m/s")
velIni = int(input('>> '))
##Aceleração (m/s2)
print("Digite a aceleração em  m/s²")
acel = int(input('>> '))
##tempo de percurso (em s).
print("Digite o tempo de percurso em segundos")
temp = int(input('>> '))

##velocidade final (em km/h)
##Calcular valores inseridos
print("Velocidade Final é igual: ", (velIni + (acel * temp)) / 1000, " Km/h")

print("Fim!!!")
