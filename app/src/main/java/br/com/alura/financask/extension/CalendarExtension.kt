package br.com.alura.financask.extension

import java.text.SimpleDateFormat
import java.util.*

fun Calendar.formataParaBrasileiro() : String {
    val formatBrazil = "dd/MM/yyyy"
    val format = SimpleDateFormat(formatBrazil)
    return format.format(this.time)
}

