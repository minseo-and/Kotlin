package function

fun main(){
    print(add(1,2,3))
}
//int a,b,c를 더하므로 반환형 타입이 int라 추론 가능
fun add(a: Int, b: Int, c: Int) = a + b + c
