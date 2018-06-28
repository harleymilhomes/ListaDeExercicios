import math

precos = []

for i in range(2):
    print("Digite o valor do produto " , i + 1)
    precos.append(float(input('>> ')))

pVenda = 0
maxValor = 0
indice = 0
for i in range(2):
    pVenda = precos[i]
    if pVenda > maxValor:
        maxValor = pVenda
        indice = i + 1

print("O ", indice, "  é o maior valor  R$%0.2f" %  maxValor);

print("Fim!!!")
