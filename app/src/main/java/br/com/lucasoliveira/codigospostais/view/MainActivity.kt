package br.com.lucasoliveira.codigospostais.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.lucasoliveira.codigospostais.R
import br.com.lucasoliveira.codigospostais.adapters.PostalCodesAdapter
import br.com.lucasoliveira.codigospostais.mock.PostalCodeDataSource
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var postalCodeAdapter: PostalCodesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
        addDataSource()
    }

    private fun addDataSource() {
        val dataSource = PostalCodeDataSource.createDataSet()
        this.postalCodeAdapter.setDataSet(dataSource)
    }

    private fun initRecyclerView() {

        this.postalCodeAdapter = PostalCodesAdapter()

        postal_codes_recyclerview.layoutManager = LinearLayoutManager(this@MainActivity)
        postal_codes_recyclerview.adapter = this.postalCodeAdapter
    }
}