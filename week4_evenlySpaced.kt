package week_4

fun  main(args: Array<String>) {
    var result = evenly(2,4,6)
    println(result)

}
fun evenly ( A:Int, B:Int, C:Int): Boolean {
    if ( B-A == C-B) return true
    return false
}