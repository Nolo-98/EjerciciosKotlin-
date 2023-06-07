fun main() {
    var nombre : String? = null;
    //nombre = null;
    println("Imprimiendo el valor de nulo de nombre: ")
    println(nombre);
    nombre = "David Emmanuel";
    //println(nombre!!.length);

    var longitud = nombre?.length ?: 0;
    println("Longitud de nombre: ");
    println(longitud);
}