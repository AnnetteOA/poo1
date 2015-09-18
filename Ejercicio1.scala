printIn ("Primera calificación")
val calif1 = readFloat()
printIn("Segunda calificación")
val calif2 = readFloat()
printIn ("Tercera calificación")
val calif3 = readFloat()
printIn("Calificación Examen Final")
val califexfin = readFloat()
printIn ("Trabajo final")
val trabfin = readFloat()
val promedio = (calif1+calif2+calif3)/3
val final = promedio *.55 + califexfin*.33 + trabfin*.15
printIn("Calificación ="+ final)
