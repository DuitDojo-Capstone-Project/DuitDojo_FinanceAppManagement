package com.capstone.duitdojo_financeappmanagement.utils

import java.text.NumberFormat
import java.util.*

fun currencyFormat(amount: Double, selectedCurrency: String): String {
    val format: NumberFormat = NumberFormat.getCurrencyInstance()
    format.maximumFractionDigits = 0
    format.currency = Currency.getInstance(selectedCurrency)
    return format.format(amount)
}

fun getCurrencySymbol(symbol: String): String =
    when (symbol) {
        "USD" -> "$"
        "EUR" -> "€"
        "GBP" -> "£"
        "JPY" -> "¥"
        "IDR" -> "Rp."
        "KRW" -> "₩"
        "SEK" -> "kr"
        "RUB" -> "₽"
        else -> ""
    }