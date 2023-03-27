package models

class Director(
    name: String,
    cpf: String,
    salary: Double,
    private val plr: Double,
    private val password: String
) : Employer(
    name = name,
    cpf = cpf,
    salary = salary
) {
    fun auth(password: String): Boolean {
        return this.password == password
    }

    override val bonus: Double get() = super.bonus + salary + plr
        
}
