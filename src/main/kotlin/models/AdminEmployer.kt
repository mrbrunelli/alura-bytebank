package models

abstract class AdminEmployer(
    name: String,
    cpf: String,
    salary: Double,
    private val password: String
) : Employer(
    name = name,
    cpf = cpf,
    salary = salary
), Authenticable {
    override fun auth(password: String): Boolean = password == this.password
}