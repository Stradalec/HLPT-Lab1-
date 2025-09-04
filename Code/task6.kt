fun main(args: Array<String>){
    if (!args.isNotEmpty()) {
        val input = readLine()
        val words = input!!.split("\\s+".toRegex()).filter { it.isNotEmpty() }
        val wordsWithoutQuotationMarks = words.map {it.trim('"')}
        val counts = wordsWithoutQuotationMarks.groupingBy { it }.eachCount()
        val sorted = counts.entries.sortedWith(compareByDescending<Map.Entry<String, Int>> { it.value }.thenBy { it.key })
        for ((word, count) in sorted) {
            println("$word $count")
        }
    }
    else {
        val inputString = args.groupingBy { it }.eachCount()
        val sortedString = inputString.entries.sortedWith(compareByDescending<Map.Entry<String, Int>> { it.value }.thenBy { it.key })
        for ((word, count) in sortedString){
            println("$word $count")
        }
    }
    
}