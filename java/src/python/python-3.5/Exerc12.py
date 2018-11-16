"""
Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da base que serão digitados.
V=(3.14 * r² x h)/3
"""
import math

print("Digite o valor do raio de um cone:")
r = int(input('>> '))
print("Digite o valor da altura do cone:")
h = int(input('>> '))

print("Área do circulo de é igual " , (3.14 * math.pow(r, 2) * h) / 3)

print("Fim!!!")
