"""
Sabendo que uma milha marítima equivale a um mil, oitocentos e cinqüenta e dois metros e que um
quilômetro possui mil metros, fazer um programa para converter milhas marítimas em quilômetros.
"""

##uma milha marítima equivale a um mil, oitocentos e cinqüenta e dois metros

m = 1852 ##// valor em metros
km = 1000 ##kilometro em metros

print("Digite o valor de milhas que deseja converter:")
valor = int(input('>> '));

result = (valor * m)/km

print(valor , " Milhas equivale a " , result , " kilometros")

print("Fim!!!")
