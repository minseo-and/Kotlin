package conditional

fun main(){
    var a: Any = 1

    if(a is Int){
        println("int")
    }

    if(a is String){
        println("string")
    }
}
