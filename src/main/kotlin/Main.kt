import models.Account
import models.CheckingAccount
import models.SavingsAccount

fun main(args: Array<String>) {
    println("Welcome to Bytebank")

    val brunelliAccount = SavingsAccount("Brunelli", 8848)
    val microsoftAccount = CheckingAccount("Microsoft", 9101)

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

