package models

class Analyst(
    name: String,
    cpf: String,
    salary: Double,
) : Employer(
    name = name,
    cpf = cpf,
    salary = salary
) {
    override val bonus: Double get() = super.bonus + salary * 0.1
}
