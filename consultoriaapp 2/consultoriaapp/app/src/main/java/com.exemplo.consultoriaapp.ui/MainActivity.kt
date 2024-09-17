package com.exemplo.consultoriaapp.ui

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.consultoriaapp.R
import com.exemplo.consultoriaapp.data.Company
import com.exemplo.consultoriaapp.network.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.list_companies)

        RetrofitClient.apiService.getCompanies().enqueue(object : Callback<List<Company>> {
            override fun onResponse(call: Call<List<Company>>, response: Response<List<Company>>) {
                if (response.isSuccessful) {
                    val companies = response.body() ?: emptyList()

                    if (companies.isNotEmpty()) {

                        val companyNames = companies.map { it.name }


                        val adapter = ArrayAdapter(
                            this@MainActivity,
                            android.R.layout.simple_list_item_1,
                            companyNames
                        )
                        listView.adapter = adapter

                        listView.setOnItemClickListener { _, _, position, _ ->
                            val selectedCompany = companies[position]
                            val intent = Intent(this@MainActivity, TaskDetailActivity::class.java)
                            intent.putExtra("COMPANY_ID", selectedCompany.id)
                            startActivity(intent)
                        }
                    } else {

                        Toast.makeText(this@MainActivity, "Nenhuma empresa encontrada", Toast.LENGTH_SHORT).show()
                    }
                } else {

                    Toast.makeText(this@MainActivity, "Erro ao carregar empresas", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<List<Company>>, t: Throwable) {
                // Falha na comunicação com a API
                Toast.makeText(this@MainActivity, "Erro de conexão: ${t.message}", Toast.LENGTH_LONG).show()
            }
        })
    }
}
