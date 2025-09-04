fun main(args: Array<String>){
    val inputString = args.sorted()
    val sortedString = inputString.groupingBy {it}.eachCount()
    for ((word, count) in sortedString){
        println("$word $count")
    }
}