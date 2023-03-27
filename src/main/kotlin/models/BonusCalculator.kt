package models

class BonusCalculator {
    var total: Double = 0.0
        private set

    fun register(employer: Employer) {
        total += employer.bonus
    }
}