fun main(args: Array<String>){
    if (args.isNotEmpty()) {
        args.groupingBy {it}.eachCount().entries.sortedBy{ it.key }.sortedByDescending { it.value }.forEach{ (value, key) ->
            println("$value $key")
        }
    }
    else {
        readLine()?.split("\\s+".toRegex())
            ?.filter { it.isNotEmpty() }
            ?.map { it.trim('"') }
            ?.groupingBy { it }
            ?.eachCount()
            ?.entries
            ?.sortedWith(compareByDescending<Map.Entry<String, Int>> { it.value }.thenBy { it.key })
            ?.forEach{ (value, key) ->
                println("$value $key")
            }
    }
    
}