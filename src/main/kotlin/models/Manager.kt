package models

class Manager(
    name: String,
    cpf: String,
    salary: Double,
    password: String
) : AdminEmployer(
    name = name,
    cpf = cpf,
    salary = salary,
    password = password
) {
    override val bonus: Double get() = salary
}
