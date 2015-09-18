println("¿Cual es tu edad?")
val edad=readInt()
println(edad)
println("Antigüedad de tu empleo?")
val antiguedad=readInt()
println(antiguedad)
if(edad>=60 && antiguedad<25){
  println(Jubilacion por: Edad")
}
if(edad<60 && antiguedad>=25){
  println("Jubilacion por: Antigúedad Joven")
}
if(edad>=60 && antiguedad>=25){
  println("Jubilacion por: Antigúedad Adulta")

}
