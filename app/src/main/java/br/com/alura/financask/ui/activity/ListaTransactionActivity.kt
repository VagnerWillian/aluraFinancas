package br.com.alura.financask.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import br.com.alura.financask.R
import br.com.alura.financask.model.Transacao
import br.com.alura.financask.ui.adapter.ListaTransacoesAdapter
import kotlinx.android.synthetic.main.activity_lista_transacoes.*
import java.math.BigDecimal
import java.util.*

class ListaTransactionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)
        val transactions: List<Transacao> = listOf(
            Transacao(BigDecimal(20), "Comida", Calendar.getInstance()),
            Transacao(BigDecimal(100), "Economia", Calendar.getInstance())
            )
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, transactions)
        lista_transacoes_listview.adapter = ListaTransacoesAdapter(transactions, this)
    }

}