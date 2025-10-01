fun main(args: Array<String>){
    args.sorted().distinct().forEach{ word ->
        println(word)
    }
}