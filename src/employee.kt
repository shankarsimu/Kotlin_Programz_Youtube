class employee {
    var name:String=""
    var age:Int=0
    var place:String=""

    fun insertData(n:String,a:Int,p:String){
        name=n
        age=a
        place=p

        println("Hi, My name Is $name")
        println("My Age Is $age")
        println("I have From $place")

    }
}

fun main(args: Array<String>) {
    var emp=employee()
    emp.insertData("SNS TECK",24,"INDIA")
}