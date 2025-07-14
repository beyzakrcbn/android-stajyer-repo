fun main() {
    print("Bir sayı girin: ")
    val input = readLine()?.toIntOrNull()

    if (input == null || input < 0) {
        println("Geçersiz giriş. Lütfen pozitif bir tam sayı girin.")
        return
    }

    var factorial = 1L

    for (i in 1..input) {
        factorial *= i
    }

    println("$input sayısının faktöriyeli: $factorial")
}
