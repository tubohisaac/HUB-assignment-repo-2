package week_3_assessment

fun multiples(){
    var i = 1
    while (i <= 100 ) {
        if (i % 3 == 0 && i % 5 == 0){
            println("FizzBuzz")
        } else if (i % 3 == 0){
            println("Fizz")
        } else if ( i % 5 == 0){
            println("Buzz")
        } else { println(i) }
        i++
        }
    }

fun main (){
    multiples()
}