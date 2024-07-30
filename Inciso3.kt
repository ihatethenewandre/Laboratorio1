fun firstNonRepeating(string: String): Int {
    // Mapa mutable para contar las ocurrencias de cada caracter
    val charCount = mutableMapOf<Char, Int>()

    // Contar las ocurrencias de cada caracter
    for (char in string) {
        // Obtener el recuento actual del caracter y aumentar en 1, o inicializar en 1 si no existe
        charCount[char] = charCount.getOrDefault(char, 0) + 1
    }

    // Encontrar el primer caracter con un recuento de 1
    for (i in string.indices) {
        // Si el caracter en la posición i tiene un recuento de 1
        if (charCount[string[i]] == 1) {
            // Devolver el índice de este caracter
            return i
        }
    }

    // Si no se encuentra ningún caracter no repetitivo, devolver -1
    return -1
}

// Función principal para ejecutar el programa
fun main() {
    // Cadena de texto
    val string = "abcdcaf"
    // Llamada a la función y almacenamiento del resultado
    val result = firstNonRepeating(string)
    // Imprimir el resultado
    println(result)
}