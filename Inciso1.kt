import kotlin.random.Random

// Definición de una clase de datos para representar un conductor
data class Driver(val name: String, var team: String, val country: String, var number: Int)

// Definición de un enumerado para representar los equipos
enum class Team {
    Mercedes, RedBullRacing, Ferrari, McLaren, AstonMartin, Alpine, AlphaTauri, AlfaRomero, Haas, Williams
}

// Lista de conductores con sus respectivos atributos
val drivers = listOf(
    Driver("Lewis Hamilton", "Mercedes", "United Kingdom", 44),
    Driver("Max Verstappen", "Red Bull Racing", "Netherlands", 33),
    Driver("Charles Leclerc", "Ferrari", "Monaco", 16),
    Driver("Sebastian Vettel", "Aston Martin", "Germany", 5),
    Driver("Fernando Alonso", "Alpine", "Spain", 14),
    Driver("Lando Norris", "McLaren", "United Kingdom", 4),
    Driver("Sergio Perez", "Red Bull Racing", "Mexico", 11),
    Driver("Daniel Ricciardo", "McLaren", "Australia", 3),
    Driver("Carlos Sainz", "Ferrari", "Spain", 55),
    Driver("Pierre Gasly", "AlphaTauri", "France", 10)
)

// Función para el Ejercicio 1
fun Ejercicio1() {
    println(">>>>>>>>>>>> EJERCICIO #1 <<<<<<<<<<<<")
    println()
    
    // Imprimir la información de cada conductor
    for (driver in drivers) {
        println("Nombre: ${driver.name}")
        println("Equipo: ${driver.team}")
        println("País: ${driver.country}")
        println("Número: ${driver.number}")
        println()
    }
    
    println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<")
    println()
}

// Función para el Ejercicio 2
fun Ejercicio2() {
    println(">>>>>>>>>>>> EJERCICIO #2 <<<<<<<<<<<<")
    println()

    // Seleccionar dos conductores al azar
    val num1 = Random.nextInt(0, 10)
    val num2 = Random.nextInt(0, 10)
    val driver1 = drivers[num1]
    val driver2 = drivers[num2]

    // Imprimir la información de los dos conductores seleccionados
    println("Piloto 1: ${driver1.name}, Equipo: ${driver1.team}, País: ${driver1.country}, Número: ${driver1.number}")
    println("Piloto 2: ${driver2.name}, Equipo: ${driver2.team}, País: ${driver2.country}, Número: ${driver2.number}")
    println()

    // Comprobar si los dos conductores son del mismo equipo
    val sameTeam = driver1.team == driver2.team
    println("¿Son del mismo equipo? $sameTeam")
    println()

    // Comprobar si los dos conductores son de diferentes países
    val differentCountry = driver1.country != driver2.country
    println("¿Son de diferentes países? $differentCountry")
    println()

    println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<")
    println()
}

// Función para el Ejercicio 3
fun Ejercicio3() {
    println(">>>>>>>>>>>> EJERCICIO #3 <<<<<<<<<<<<")
    println()
    
    // Seleccionar un conductor al azar
    val num = Random.nextInt(0, 10)
    val driver1 = drivers[num]
    // Crear una copia del conductor seleccionado
    val driver2 = driver1.copy()
    
    // Modificar el equipo y número del conductor copiado
    driver2.team = "Williams"
    driver2.number = 99
    
    // Imprimir la información del conductor original y del conductor copiado
    println("Piloto Original: ${driver1.name}, Equipo: ${driver1.team}, País: ${driver1.country}, Número: ${driver1.number}")
    println("Piloto Copia: ${driver2.name}, Equipo: ${driver2.team}, País: ${driver2.country}, Número: ${driver2.number}")
    println()
    
    println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<")
    println()
}

// Función para el Ejercicio 4
fun Ejercicio4() {
    println(">>>>>>>>>>>> EJERCICIO #4 <<<<<<<<<<<<")
    println()
    
    // Seleccionar un conductor al azar
    val num = Random.nextInt(0, 10)
    val (name, team, country, number) = drivers[num]
    
    // Imprimir la información del conductor seleccionado usando desestructuración
    println("Nombre: $name")
    println("Equipo: $team")
    println("País: $country")
    println("Número: $number")
    println()
    
    println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<")
    println()
}

// Función para el Ejercicio 5
fun Ejercicio5() {
    println(">>>>>>>>>>>> EJERCICIO #5 <<<<<<<<<<<<")
    println()
    
    // Imprimir la representación en cadena de cada conductor
    for (driver in drivers) {
        println(driver.toString())
    }
    println()

    println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<")
    println()
}

// Función para la Tarea 1 del Ejercicio 6
fun getRandomTeam(): Team {
    val teams = Team.values()
    return teams[Random.nextInt(teams.size)]
}

// Función para la Tarea 2 del Ejercicio 6
fun printTeamDetails(team: Team) {
    when (team) {
        Team.Mercedes -> {
            println("Equipo de Fórmula 1 con sede en Brackley, Reino Unido. Dominante en la era híbrida.")
        }
        Team.RedBullRacing -> {
            println("Equipo austriaco con base en Milton Keynes. Conocidos por su agresividad y aerodinámica.")
        }
        Team.Ferrari -> {
            println("Icono italiano con sede en Maranello. Apasionados fanáticos y rica historia.")
        }
        Team.McLaren -> {
            println("Equipo histórico con sede en Woking, Reino Unido. Campeones múltiples.")
        }
        Team.AstonMartin -> {
            println("Anteriormente Racing Point, ahora rebrandeado como Aston Martin.")
        }
        Team.Alpine -> {
            println("Antes Renault, ahora Alpine. Buscan el éxito en la Fórmula 1.")
        }
        Team.AlphaTauri -> {
            println("Equipo hermano de Red Bull Racing. Basado en Faenza, Italia.")
        }
        Team.AlfaRomero -> {
            println("Colaboración ítalo-suiza con sede en Hinwil, Suiza.")
        }
        Team.Haas -> {
            println("Equipo estadounidense con base en Kannapolis. Luchando por resultados.")
        }
        Team.Williams -> {
            println("Equipo histórico británico. En dificultades recientes.")
        }
    }
}

// Función principal para ejecutar todos los ejercicios
fun main() {
    Ejercicio1()
    Ejercicio2()
    Ejercicio3()
    Ejercicio4()
    Ejercicio5()
    
    // Función para la Tarea 3 del Ejercicio 6
    println(">>>>>>>>>>>> EJERCICIO #6 <<<<<<<<<<<<")
    println()
    
    val randomTeam = getRandomTeam()
    println("Equipo Aleatorio: $randomTeam")
    printTeamDetails(randomTeam)
    println()

    println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<")
    println()
}