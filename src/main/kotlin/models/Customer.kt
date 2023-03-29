package models

class Customer(
    val name: String,
    val cpf: String,
    override val password: String
): Authenticable