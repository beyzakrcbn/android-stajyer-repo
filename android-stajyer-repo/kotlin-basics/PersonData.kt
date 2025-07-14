// Kişi verisi sınıfı
data class PersonData(val name: String, val age: Int)

fun main() {
    val person = PersonData("Beyza", 21)
    println("Ad: ${person.name}")
    println("Yaş: ${person.age}")
}
