class Employee(val firstName: String, val lastName: String, val age: Int, val salary: Int) {
    fun isWealthy(): Boolean {
        return salary > 1000
    }

    override fun toString(): String {
        return "$firstName $lastName is $age"
    }
}

fun main(){
    // Example usage
    val employee1 = Employee("Linus", "Torvalds", 53, 2000)
    val employee2 = Employee("rey", "shms", 21, 800)
    val employee3 = Employee("Amir", "masoumi", 20 , 3500)

    println(employee3) // Output: Linus Torvalds is 53
    println(employee3.isWealthy()) // Output: true

}
