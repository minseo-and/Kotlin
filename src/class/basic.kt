package `class`

fun main(){
    var a = Prs("awd", 23)

    println("${a.birth} ${a.name}")
    a.introduce()
}

class Prs(var name:String, val birth:Int){
    fun introduce(){
        println("$name $birth")
    }
}