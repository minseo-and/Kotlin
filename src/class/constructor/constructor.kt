package `class`.constructor

fun main(){
    var a = Prs("awd")

}

class Prs(var name:String, val birth:Int){
    //this를 사용해 기본 생성자로 값을 넘겨줘야 한다.
    constructor(name:String): this(name, 23)
    init{
        println("${this.name} ${this.birth}")
    }
}
