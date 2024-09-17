package com.exemplo.consultoriaapp.network

import com.exemplo.consultoriaapp.data.Company
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("companies")
    fun getCompanies(): Call<List<Company>>

    @GET("companies/{id}")
    fun getCompanyDetail(@Path("id") id: Int): Call<Company>
}