


fun main ( ){
    reverseddigits( 6787554)
}

fun  reverseddigits( num: Int){
    if ( num >=0 ) {
        val y = num.toString()
        val char : Array<Char> = y.toCharArray().toTypedArray()
        print (char.reversed())} else{
            print (" Enter a positive Integer ")



    }

}

