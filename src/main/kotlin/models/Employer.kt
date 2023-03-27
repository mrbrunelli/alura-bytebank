package models

open class Employer(
    val name: String,
    val cpf: String,
    val salary: Double,
) {
    open val bonus: Double get() = salary * 0.1
}