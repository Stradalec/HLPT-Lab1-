fun <T : Comparable<T>> Iterable<T>.groupSort(action: (key: T, count: Int) -> Unit): List<Pair<T, Int>> {
    val sorted = this.groupingBy { it } .eachCount().entries.sortedWith(compareByDescending<Map.Entry<T, Int>> { it.value }.thenBy { it.key })
    
    sorted.forEach { (key, value) -> action(key, value) }
    
    return sorted.map { it.toPair() }
}

fun main(args: Array<String>) {
    if (args.isNotEmpty()) {
        args.toList().groupSort { value, key ->
            println("$value $key")
        }
    }
    else {
        readLine()?.let { line ->
            line.split("\\s+".toRegex())
            .filter { it.isNotEmpty() }
            .map { it.trim('"') }
            .groupSort { value, key ->
                println("$value $key")
            }
        } ?: emptyList()

    }
}

