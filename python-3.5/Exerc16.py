import math

print("FUNCOES TRIGONOMETRICAS")
print("Entre com o valor do angulo: ")
angulo = float(input('>> '))

result = math.sin(angulo);
print("Seno: %0.2f" % result);
result = math.cos(angulo);
print("Cosseno: %0.2f" % result);
result = math.tan(angulo);
print("Tangente: %0.2f" % result);
result = 1 / (math.cos(angulo));
print("Secante: %0.2f" % result);

print("Fim!!!")
