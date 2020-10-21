package ru.netology

fun main() {
    val price = 70_000
    val standartDiscount = 100
    val fivePercentDiscount = (price * 5 / 100).toInt()
    val regularCustomer: Boolean = true
    val sum = discount(price, standartDiscount, fivePercentDiscount)

    if (regularCustomer) {
        val regularDiscount = sum * 0.01
        val result = (sum - regularDiscount).toInt()
        println("Сумма заказа со скидками: $result руб.")
    } else {
        val result = (price - standartDiscount)
        println("Сумма заказа со скидками: $sum руб.")
    }

}

private fun discount(price: Int, standartDiscount: Int, fivePercentDiscount: Int): Int =

    when {
        price <= 1000 -> {
            price
        }
        price in 1001..10_000 -> {
            price - standartDiscount
        }
        else -> price
    }
