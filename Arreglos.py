lista = []
lista = ["Leif",5,-9,False,"Rugerio",88,55]
lista2 = (5,8,1,0,6)
print(lista)
print(lista[0:3])#muestra del 0 al 3
print(lista[2:1])# muestra del 2 al 3
print(lista[1:])
lista.append("Leif")
lista.insert(2,"Carlos")#elementos al final de la lista
lista.extend((["Sandra",7]))#añade
lista2.sorted()#ascendente
lista.reverse()#descendente
lista.remove("carlos")
print(lista2)

for l in lista : 
    print(l)