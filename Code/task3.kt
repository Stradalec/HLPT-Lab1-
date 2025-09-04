fun main(args: Array<String>){
    val inputString = args.sorted().distinct()
    for (word in inputString){
        println(word)
    }
}