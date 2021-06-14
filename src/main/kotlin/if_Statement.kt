fun main(){
    val a : Int =  10
    val b : Int  = 30
    val password : String = "1234"
    var y: Int = 2345
    
// no. 1
    if ( a == b ){ println(" $a is equal to $b")} else { print (" a and b are not equal")}
// no. 2
    if ( b > a ){ println( "print b > a ")} else { print (" $b is not greater   $a")}
// no. 3
    if ( a * b == 300 ){ println (" $a * $b is 300") } else { print (" testing")}
// no. 4
    if( password != " 1234") {
        println(" $password is incorrect")}
//    no. 5
// short form without curl braces
    val i = if ( y == a ) " $y is equal to $a" else " $y is not equal to $a"
    println(i)





}







