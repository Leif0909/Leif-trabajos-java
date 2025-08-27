cadena1 = "Messi es mejor que cualquier futbolista del mundo"
print("capitaliza",cadena1.capitalize())
cadena2 = "SOS"
print("casefold", cadena2.casefold())
print(cadena2.center(10,"😎"))
menus = ("Menu","Depositar","Retirar","Consultar")
for menu in menus :
    print(menu.center(20),'Messi es dios')

cadena3 = "hola mundo"
print(cadena3.count("o",3,10))