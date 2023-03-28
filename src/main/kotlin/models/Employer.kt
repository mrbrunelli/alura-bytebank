package models

abstract class Employer(
    val name: String,
    val cpf: String,
    val salary: Double,
) {
    abstract val bonus: Double
}