fun main(){

var tithe1 : tithe =tithe( "Mike", "John", 2500, "June", 2021 )
    println("member payment details     ${tithe1.fname} ${tithe1.sname} ${tithe1.amount}  ${tithe1.month} ${tithe1.year}")

var chairFurniture1 : chairFurniture = chairFurniture(34500.00,"L-Shape ",123.23,150.00, "brown and yellow")
    println( " Chair details  ${chairFurniture1.price} ${chairFurniture1.design} ${chairFurniture1.size} ${chairFurniture1.deliveryCost} ${chairFurniture1.color}")

var student1: student = student("Alex" ,"Benson", 23, 400, 4.35)
     println( " Student's details   ${student1.fName} ${student1.sName} ${student1.age} ${student1.level}  ${student1.cGPA}")

var patience1 : patience = patience( "Johnson", "Yinka", 54.65, 54, "normal")
     println(" Patient's details   ${patience1.firstN}, ${patience1.secondN} ${patience1.height} ${patience1.age}  ${patience1.bloodPressure}")

 var doctor1 : doctor = doctor("Jacob", 38, "Dentist", 10, "contract")
     println( "Doctor's details  ${doctor1.name} ${doctor1.age} ${doctor1.specialty} ${doctor1.yearsOfexp} ${doctor1.employmentStatus}")

}
class tithe {
    var fname: String =""
    var sname: String =""
    var amount: Int = 0
    var month : String =""
    var year : Int = 0
    var branch: String = ""


    constructor( fname: String , sname:String, amount : Int, month:String, year: Int){
        this.fname = fname
        this.sname = sname
        this.amount = amount
        this.month = month
        this.year = year
    }
}
class chairFurniture {
    var price : Double = 0.0
    var design : String =""
    var size : Double = 0.0
    var deliveryCost: Double = 0.0
    var  color : String = ""

    constructor ( price: Double, design: String, size : Double, deliverCost:Double, colour: String){
        this.price = price
        this.design = design
        this.size  = size
        this.deliveryCost = deliveryCost
        this.color = color
    }
}
class student{
    var fName : String =""
    var sName : String =""
    var age : Int = 0
    var level : Int = 0
    var cGPA: Double = 0.0

    constructor( fName: String, sName: String, age:Int, level: Int, cPGA:Double){
        this.fName = fName
        this.sName = sName
        this.age  = age
        this.level = level
        this.cGPA = cPGA
    }
}

class patience{
    var firstN : String = " "
    var secondN : String =""
    var height : Double = 0.0
    var age : Int = 0
    var bloodPressure : String = ""

    constructor ( fname: String, sname: String, height: Double, age : Int, bP: String){
        this.firstN = fname
        this.secondN = sname
        this.height  = height
        this.age = age
        this.bloodPressure = bP

    }

}
class doctor {
    var name : String = " "
    var age : Int = 0
    var specialty : String = ""
    var yearsOfexp : Int = 0
    var  employmentStatus :String = " "

constructor ( name:String, age: Int, specailty: String, yearsOfE: Int, employ: String){
    this.name = name
    this.age = age
    this.specialty  = specialty
    this.yearsOfexp  = yearsOfE
    this.employmentStatus = employ
}
}