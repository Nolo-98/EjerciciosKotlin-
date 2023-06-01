fun main() {
    val num1 = 12
    val num2 = 13

    borde("=", 15)
    val resultado = suma(num1, num2)
    println(resultado)
    borde("*", 30)

    // Example of an anonymous function
    val slogan = { resultado: Int -> println("Tú puedes con $resultado y más") }

    // Invoking the anonymous function
    slogan(resultado)
    slogan.invoke(resultado)

    val resta = { num1: Int, num2: Int -> num1 - num2 }
    println("Resta: ${resta(12, 18)}")

    // Finding the maximum of three numbers
    val max = { num1: Int, num2: Int, num3: Int ->
        if (num1 > num2 && num1 > num3) {
            num1
        } else if (num2 > num3) {
            num2
        } else {
            num3
        }
    }

    println("Valor máximo: ${max(10, 20, 15)}")

    // Calculating the average of three numbers
    val promedio = { num1: Int, num2: Int, num3: Int -> (num1 + num2 + num3) / 3.0 }
    println("Promedio: ${promedio(10, 20, 30)}")
}

fun borde(caracter: String, veces: Int) {
    for (i in 1..veces) {
        print(caracter)
    }
    println()
}

fun suma(num1: Int, num2: Int): Int {
    return num1 + num2
}
