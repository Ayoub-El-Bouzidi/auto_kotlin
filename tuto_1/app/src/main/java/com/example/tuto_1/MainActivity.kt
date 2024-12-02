//fun main() {
//    println("Bonjour, Kotlin !")
//}
//fun main() {
//    val nom = "Solicode" // Variable immuable
//    var age = 5          // Variable mutable
//
//    println("Nom : $nom")
//    println("Age : $age")
//
//    age = 6 // Modification possible avec var
//    println("Nouvel Age : $age")
//}
//val entier: Int = 42
//val decimal: Double = 3.14
//val caractere: Char = 'A'
//val chaine: String = "Bonjour"
//val boolean: Boolean = true
//
//fun main() {
//    val age = 18
//
//    if (age >= 18) {
//        println("Vous êtes majeur.")
//    } else {
//        println("Vous êtes mineur.")
//    }
//}
fun main() {
    val jour = 3

    when (jour) {
        1 -> println("Lundi")
        2 -> println("Mardi")
        3 -> println("Mercredi")
        else -> println("Autre jour")
    }
}