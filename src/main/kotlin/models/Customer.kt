package models

class Customer(
    val name: String,
    val cpf: String,
    private val password: String
): Authenticable {
    override fun auth(password: String): Boolean = password === this.password
}