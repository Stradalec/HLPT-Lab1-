fun main(args: Array<String>){
    args.sorted().groupingBy {it}.eachCount().forEach{ (word, count) ->
        println("$word $count")
    }
}