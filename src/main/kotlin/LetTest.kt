val str = "123"
val result = str.toIntOrNull()

fun main(){
result?.let { num ->
    println("Converted number is: $num")
} ?: run {
    println("Conversion failed, performing backup operation...")
}
}