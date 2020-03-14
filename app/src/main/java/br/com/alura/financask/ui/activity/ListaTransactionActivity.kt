package br.com.alura.financask.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import br.com.alura.financask.R
import br.com.alura.financask.ui.adapter.ListaTransacoesAdapter
import kotlinx.android.synthetic.main.activity_lista_transacoes.*

class ListaTransactionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)
        val transactions: List<String> = listOf("Comida - R$ 20,50", "Economia - 100,00")
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, transactions)
        lista_transacoes_listview.adapter = ListaTransacoesAdapter(transactions, this)
    }

}