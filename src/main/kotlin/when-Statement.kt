


fun main(){

var  instrument : String = "  Dermatone  "
var uses : String = when( instrument){

     " surgical pinzette" -> " for Grasping or holding "
      " Dermatone "       -> " to take of top layer of skin to implant over another area"
      " Bone chisel "     -> " for cutting "
      " Cautery"          -> " to cauterize and seal vessels and bone "
      " Curette"         -> " for scraping or debriding"
    else   ->  " not in the list   "
}
println( uses )
    val x : Int = 3
    var y : String =   when ( x ) {
         1 -> " One "
         2 -> " Two "
         3 -> " Three"
         4 -> " Four "
         5 -> " Five"
         else -> " number out of range "
    }
    print( y)

}

