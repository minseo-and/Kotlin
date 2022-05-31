package function

fun main() {
    b(::a)

    var c : (String)->Unit = {s -> println(s)}
    var d = {s : String -> println(s)}
    var e = {s : String -> s}
    var f = {
        println("xzcxc")
    }
    var g : (String)->Unit = { println(it) }

    c("zxc")
    d("sss")
    println("ccc")
    f()
    g("qqq")
}

fun a(str : String) : String {
    return str
}

fun b(funs : (String) -> String) {
    println(funs("awds"))
}