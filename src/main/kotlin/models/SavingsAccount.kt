package models

class SavingsAccount(
    owner: String,
    number: Int
) : Account(
    owner = owner,
    number = number
) {
    override fun withdraw(value: Double) {
        if (canExecuteOperation(value)) {
            balance -= value
        }
    }
}