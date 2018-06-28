##Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será digitado.
##Área da do quadrado apartir do teorema de pitágoras
##A=d²/2
print("Digite a diagonal do seu Quadrado:")
d = int(input('>> '))
##como eu estava sem a bibliotea Math usei o principio de que d² é o mesmo que dxd
A = (d * d) / 2;
print("A área do quadrado usando a Digonal de valor " , d , " é igual: " , A)

print("Fim!!!")
