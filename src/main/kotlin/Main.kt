import models.Account

fun main(args: Array<String>) {
    println("Welcome to Bytebank")

    val brunelliAccount = Account("Brunelli", 8848)
    val microsoftAccount = Account("Microsoft", 9101)

    brunelliAccount.deposit(1500.0)
    microsoftAccount.deposit(20000.0)

    if (microsoftAccount.transfer(target = brunelliAccount, value = 18025.90)) {
        println("Transfer completed successfully")
    } else {
        println("Transfer couldn't completed")
    }

    brunelliAccount.withdraw(550.0)

    println(brunelliAccount)
    println(microsoftAccount)
}

