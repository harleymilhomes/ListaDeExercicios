"""
A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.
A = 3,14 * r²
"""
import math

print("Digite o valor do diâmetro de um círculo:")
r = int(input('>> ')) / 2

print (r)

print("Área do circulo de é igual " , 3.14 * math.pow(r, 2))

print("Fim!!!")
