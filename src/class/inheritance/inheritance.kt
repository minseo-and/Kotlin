package `class`.inheritance

fun main(){
    var dog = Dog("a", 12)
    dog.introduce1()
    dog.introduce()
}

open class Animal(var name:String, var age:Int, var type:String){
    open fun introduce(){
        println("${this.name} ${this.age} ${this.type}")
    }
}
class Dog(var name1: String, var age1: Int) : Animal(name1, age1, "강아지"){
    fun introduce1(){
        super.introduce()
    }

    override fun introduce() {
        println("override")
    }
}