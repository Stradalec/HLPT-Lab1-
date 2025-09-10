fun <T : Comparable<T>> Iterable<T>.groupSort(action: (key: T, count: Int) -> Unit) {
    this.groupingBy { it }.eachCount().entries.sortedWith(compareByDescending<Map.Entry<T, Int>> { it.value }.thenBy { it.key }).forEach { (key, value) -> action(key, value) }
}

fun main(args: Array<String>) {
    if (args.isNotEmpty()) {
        args.toList().groupSort { key, count ->
            println("$key $count")
        }
    }
    else {
        readLine()?.split("\\s+".toRegex())
            ?.filter { it.isNotEmpty() }
            ?.map { it.trim('"') }
            ?.toList()
            ?.groupSort { key, count ->
                println("$key $count")
            }
    }
    
}

