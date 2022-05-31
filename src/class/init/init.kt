package `class`.init

fun main(){
    var a = Prs("awd", 23)

}

class Prs(var name:String, val birth:Int){
    init{
        println("${this.name} ${this.birth}")
    }
    init{
        println(1)
    }
}