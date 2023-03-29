package models

interface Authenticable {
    fun auth(password: String): Boolean
}