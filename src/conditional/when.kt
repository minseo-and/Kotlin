package conditional

fun main(){
    exWhen(2)
}
fun exWhen(a: Any){
    when(a){
        1 -> print(a)
        "awd" -> print(a)
        else -> print(a)
    }
}