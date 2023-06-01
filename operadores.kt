fun main() {
    val a = 10
    val b = 5
    var c = 0

    println("Operadores")

    // Suma
    c = a.plus(b)
    println("$c = $a + $b")

    // Resta
    c = a.minus(b)
    println("$c = $a - $b")

    // Comparación
    println(b.compareTo(a) > 0)
    println(a.compareTo(b) > 0)
}
