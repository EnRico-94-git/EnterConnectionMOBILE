package com.exemplo.consultoriaapp.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.consultoriaapp.R
import com.exemplo.consultoriaapp.data.Company
import com.exemplo.consultoriaapp.network.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class TaskDetailActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task_detail)

        val companyId = intent.getIntExtra("COMPANY_ID", -1)
        val textView = findViewById<TextView>(R.id.text_company_detail)

        if (companyId != -1) {

            RetrofitClient.apiService.getCompanyDetail(companyId).enqueue(object : Callback<Company> {
                override fun onResponse(call: Call<Company>, response: Response<Company>) {
                    val company = response.body()
                    textView.text = company?.details ?: "Detalhes não disponíveis"
                }

                override fun onFailure(call: Call<Company>, t: Throwable) {

                }
            })
        }
    }
}