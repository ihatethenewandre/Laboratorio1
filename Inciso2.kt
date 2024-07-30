fun buildingsSunsetView(buildings: List<Int>, direction: String): List<Int> {
    // Lista para almacenar los índices de los edificios que pueden ver la puesta de sol
    val result = mutableListOf<Int>()
    // Número total de edificios
    val n = buildings.size

    // Si la dirección es este
    if (direction == "EAST") {
        // Variable para mantener el edificio más alto encontrado hasta ahora
        var maxSoFar = 0
        // Iterar de derecha a izquierda
        for (i in n - 1 downTo 0) {
            // Si el edificio actual es más alto que el máximo encontrado hasta ahora
            if (buildings[i] > maxSoFar) {
                // Añadir el índice del edificio a la lista de resultados
                result.add(i)
                // Actualizar el máximo encontrado hasta ahora
                maxSoFar = buildings[i]
            }
        }
    // Si la dirección es oeste
    } else if (direction == "WEST") {
        // Variable para mantener el edificio más alto encontrado hasta ahora
        var maxSoFar = 0
        // Iterar de izquierda a derecha
        for (i in 0 until n) {
            // Si el edificio actual es más alto que el máximo encontrado hasta ahora
            if (buildings[i] > maxSoFar) {
                // Añadir el índice del edificio a la lista de resultados
                result.add(i)
                // Actualizar el máximo encontrado hasta ahora
                maxSoFar = buildings[i]
            }
        }
    }

    // Ordenar la lista de resultados en orden ascendente y devolverla
    return result.sorted()
}

// Función principal para ejecutar el programa
fun main() {
    // Lista de alturas de los edificios
    val buildings = listOf(3, 5, 4, 4, 3, 1, 3, 2)
    // Dirección en la que miran los edificios
    val direction = "EAST"
    // Llamada a la función y almacenamiento del resultado
    val result = buildingsSunsetView(buildings, direction)
    // Imprimir el resultado
    println(result)
}