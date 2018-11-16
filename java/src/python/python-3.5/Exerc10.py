"""
Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e exibir sua temperatura
equivalente em Fahrenheit.
F=1,8C+32
"""

print("Digite o valor em Celsius para converter em Fahrenheit:");
valor = int(input(">> "))

print(valor , " Celsius equivale a ", (1.8 * valor) + 32, " Fahrenheit")

print("Fim!!!")
