package models

class CheckingAccount(
    owner: String,
    number: Int
) : Account(
    owner = owner,
    number = number
) {
    override fun withdraw(value: Double) {
        val priceIncludingTax = value * 0.01
        if (canExecuteOperation(priceIncludingTax)) {
            balance -= priceIncludingTax
        }
    }
}