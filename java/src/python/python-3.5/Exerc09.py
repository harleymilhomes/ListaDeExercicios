"""
Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos valores da resistência e
corrente elétrica que serão digitados. Utilize a lei de Ohm.
V=IxR
V = Tensão elétrica,  unidade volt (V é a letra que representa a unidade).
I = Corrente elétrica,  unidade âmpere (A é a letra que representa a unidade).
R = Resistência elétrica,  unidade Ohm (Ω é a letra grega que representa a unidade).
"""

print("Digite o valor da Resistência elétrica:")
r = int(input(">> "))
print("Digite o valor da Corrente elétrica:")
i = int(input(">> "))

print("O Valor da Tensão elétrica é: " , i * r)

print("Fim!!!")
