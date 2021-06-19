package week_3_assessment

 fun printBackwards() {
       println(" ENTER WORDS, NUMBERS OR SENTENCE")
    val word: String = readLine().toString()
        var  i = word.lastIndex
        var printBackward: String = ""
    while ( i >= 0) {
        printBackward += word[i]
        i--}
        print ( " Backwards : $printBackward")
    }

fun main ( ){
printBackwards()
}

