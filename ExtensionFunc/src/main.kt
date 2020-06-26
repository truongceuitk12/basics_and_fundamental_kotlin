fun main(args: Array<String>) {
    val student = Student()
    print(student.hasPass(45))
    print(student.isSchoolar(45))
    println(4.add(5,6))


}
fun Int.add(a : Int , b : Int) : Int  = this + a + b

fun Student.isSchoolar(marks: Int): Boolean {
    return marks > 95
}

class Student {
    fun hasPass(marks: Int): Boolean {
        return marks > 50
    }
}