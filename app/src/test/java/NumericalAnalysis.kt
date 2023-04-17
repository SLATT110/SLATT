fun main() {
    val numbers = mutableListOf<Int>()
    println("Enter three numbers:")
    for (i in 1..3) {
        val input = readLine()!!.toInt()
        numbers.add(input)
    }
    val max = numbers.maxOrNull()
    val min = numbers.minOrNull()
    val evens = numbers.filter { it % 2 == 0 }
    val odds = numbers.filter { it % 2 != 0 }
    val average = numbers.average()
    println("Maximum: $max")
    println("Minimum: $min")
    println("Evens: $evens")
    println("Odds: $odds")
    println("Average: $average")
}

