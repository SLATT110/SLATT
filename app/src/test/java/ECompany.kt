class Employee(val firstName: String, val lastName: String, val age: Int, val salary: Int) {
    fun Wealth() = salary > 1000
    override fun toString() = "$firstName $lastName is $age"
}
fun main(){
    // Example usage
    val employee1 = Employee("rey", "shms", 21, 800)
    val employee2 = Employee("Amir", "masoumi", 20 , 3500)

    println(employee1) // Output: rey shms is 21
    println(employee1.Wealth()) // Output: false

}
