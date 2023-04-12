class Person(val name: String, var age: Int) {
    fun introduce() {
        println("Hi, my name is $name and I am $age years old.")
    }
}

fun Person.birthday() {
    this.age++ // 使用 this 引用当前对象
    print(this.age)
    println("Happy birthday, ${this.name}!")
}

fun main(){
    val person: Person= Person("Xiaowang",22)
    person.introduce()
    person.birthday()

}
