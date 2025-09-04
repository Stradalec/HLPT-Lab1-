fun main(args: Array<String>){
    val inputString = args.groupingBy { it }.eachCount()
    val sortedString = inputString.entries.sortedWith(compareByDescending<Map.Entry<String, Int>> { it.value }.thenBy { it.key })
    for ((word, count) in sortedString){
        println("$word $count")
    }
}