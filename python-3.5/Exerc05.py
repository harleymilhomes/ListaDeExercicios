##Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que será digitado.
import math

print("Digite o valor de seu diâmetro de uma esfera:")
r = (int(input('>> '))) / 2

r = math.pow(r, 3)

V = (4 * 3.14 * r) / 3;
print("O volume da sua Esfera é igual: " , V)

print("Fim!!!")
