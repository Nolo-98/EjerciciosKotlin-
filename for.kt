fun mail() {
    println("Valor de i: ")
    for (i in 1..10) {
        println(i)
    }

    var suma = 0
    for (i in 1..10) {
        suma += i
    }
    println("Valor de suma: $suma")

    println()
    println("Letras: ")
    for (caracter in 'a'..'g' step 2) {
        println(caracter)
    }

    val mascotas = arrayOf("gato", "yo", "el")
    println()
    println("Mascotas: ")
    for (i in mascotas.indices) {
        println("$i: ${mascotas[i]}")
    }

    println()
    println("Dividimos un string en caracteres ")
    for (letra in "---Hola mundo---") {
        println(letra)
    }
}
