"""
Calcular e exibir a média geométrica de dois valores quaisquer que serão digitados.

Para calcularmos a média geométrica entre números devemos realizar a multiplicação
entre eles e, logo em seguida, extrair a raiz com índice igual ao número de fatores
utilizados na multiplicação
"""

import math

valores = []
print("Digite dois valores, um por vez")
for i in range(2):
    valores.append(int(input('>> ')))

## multiplicar os valores de entrada
result = valores[0] * valores[1];

##raiz quadrada dos valores inseridos
result = math.sqrt(result)
print("a média geométrica é :" , result);

print("Fim!!!")
