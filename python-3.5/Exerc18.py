import math

precos = []

for i in range(5):
    print("Digite o valor do produto " , i + 1)
    precos.append(float(input('>> ')))

pVenda = 0
for i in range(5):
    pVenda += precos[1]

print("Valor Total: " , pVenda)

print("valor Recebido")
r = float(input('>> '))

print("Troco: R$%0.2f" % (r - pVenda))

print("Fim!!!")
