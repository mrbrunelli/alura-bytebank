package models

import java.text.NumberFormat
import java.util.*

class Account(private val owner: String, private val number: Int) {
    var balance = 0.0
        private set

    fun deposit(value: Double) {
        if (value > 0) this.balance += value
    }

    fun withdraw(value: Double) {
        if (canExecuteOperation(value)) {
            balance -= value
        }
    }

    fun transfer(value: Double, target: Account): Boolean {
        if (canExecuteOperation(value)) {
            balance -= value
            target.deposit(value)
            return true
        }
        return false
    }

    private fun canExecuteOperation(value: Double): Boolean {
        return balance >= value
    }

    override fun toString(): String {
        return "$owner account n° $number - balance: ${
            NumberFormat.getCurrencyInstance(Locale("pt", "BR")).format(balance)
        }"
    }
}