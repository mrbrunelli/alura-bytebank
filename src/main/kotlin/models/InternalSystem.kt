package models

class InternalSystem {
    fun enter(authenticable: Authenticable, password: String) {
        if (authenticable.auth(password)) {
            println("Welcome to Bytebank")
        } else {
            println("Auth error")
        }
    }
}