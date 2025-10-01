fun main(args: Array<String>){
    args.groupingBy {it}.eachCount().entries.sortedBy{ it.key }.sortedByDescending { it.value }.forEach{ (value, key) ->
        println("$value $key")
    }
}