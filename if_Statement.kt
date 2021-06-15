fun main(){
    var a : Int =  10
    var b : Int  = 30
    val password : String = "1234"
    var y: Int = 2345
    
// no. 1
    if ( a == b ){ println(" $a is equal to $b")} else { println (" a and b are not equal")}
// no. 2
    if ( b > a ){ println( " $b > $a ")} else { println (" $b is not greater   $a")}
// no. 3
    if ( a * b == 300 ){ println (" $a * $b is 300") }
    else { println (" testing")}
// no. 4
    if( password != " 1234") {
        println(" password is incorrect")}
//    no. 5
// short form without curl braces
    val i : String = if ( y == a ) " $y is equal to $a" else " $y is not equal to $a"
    println(i)
// no.6
    var isJohn : String =" John is Awesome!"
    if ( isJohn == " John is Awesome!") { println(i)} else { println ( "Johnson isn't" )}
// n0.7
      val test: String =  if ( b % 2 == 0) " $b is an EVEN number " else " it is not an even number "
        println( test)
//  no. 8
       val yes : String = " John is angry"
       if ( yes != " John is angry") { println(" Do nothing to make John angry")}
       else if  ( yes == "John is angry"){ println(" do something to make John happy")}
        else { println(" John is happy! ")

//     no. 9
           val t : String = if ( a % 2 == 1 ) "$a is  not an Even number" else " $a is an odd number "
           println(t)}
//    no. 10
         var bool : Boolean = true
           if( bool == 12 > 2) { println(" This statement is $bool") }
           else{  println( " The statement is false")}
        }

















