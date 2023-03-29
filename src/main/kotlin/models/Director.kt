package models

class Director(
    name: String,
    cpf: String,
    salary: Double,
    private val plr: Double,
    password: String
) : AdminEmployer(
    name = name,
    cpf = cpf,
    salary = salary,
    password = password
) {
    override val bonus: Double get() = salary + plr
}
