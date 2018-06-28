##Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.
valores = []

print("insira 4 valores, sendo um por vez")
for i in range(4):
    print(i)
    valores.append(int(input('>> ')))

result = 0
for i in range(4):
    result += valores[i]
    ##print(valores[i])

print("A média aritmética de quatro valores inseridos: " , result/4)

print("Fim!!!")
