import com.google.gson.Gson

// JSON 数据
val jsonString = """
{
    "name": "John",
    "age": 30,
    "city": "New York"
}
"""

// 定义一个类来表示 JSON 数据
data class Person(val name: String, val age: Int, val city: String)

// 使用 Gson 将 JSON 数据转换为对象
val gson = Gson()
val person = gson.fromJson(jsonString, Person::class.java)

fun main() {
// 访问对象的属性
    println(person.name)  // 输出：John
    println(person.age)  // 输出：30
    println(person.city)  // 输出：New York
}