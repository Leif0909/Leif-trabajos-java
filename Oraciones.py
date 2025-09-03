frase = input("Escribe una frse:")
frase = frase.split()
print(frase)
for i in frase:
    print(i.upper())

repeticion = input("Que palabra quieres que cuente")
print(frase.count(repeticion))

repeticion = input("Que palabra quieres que remplaze:")
rep  = input("Por cual quieres remplazarla:")

for i in frase: 
    print(i.replace(repeticion,rep))