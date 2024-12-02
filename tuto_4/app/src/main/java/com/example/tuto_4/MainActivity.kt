fun determineCategory(age: Int): String {
    return when {
        age < 13 -> "Enfant"
        age in 13..19 -> "Adolescent"
        age in 20..64 -> "Adulte"
        else -> "Sénior"
    }
}

fun printName(name: String?) {
    println(name?.uppercase() ?: "Nom inconnu")
}

class Person(val name: String, var age: Int) {
    fun introduce() {
        println("Je m'appelle $name et j'ai $age ans.")
    }
}