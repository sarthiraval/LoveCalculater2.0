package com.example.lovecalculater20.data.network

import com.example.lovecalculater20.data.model.LoveResults
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiService {

    @Headers("x-rapidapi-key: 72ca1bbcd4msh2635007a217ffb8p140999jsndca5f4311295")
    @GET("getPercentage")
    suspend fun getLoversResult(
        @Query("fname") fName: String?,
        @Query("sname") sName: String?
    ): LoveResults
}
