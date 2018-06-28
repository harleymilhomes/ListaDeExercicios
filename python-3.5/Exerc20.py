import math

precos = []

for i in range(2):
    print("Digite o valor do produto " , i + 1)
    precos.append(float(input('>> ')))

if (precos[0] < precos[1]):
    print("O primeiro valor é o menor: ", precos[0])
else:
    print("O Segundo valor é o menor: ", precos[1])


print("Fim!!!")
