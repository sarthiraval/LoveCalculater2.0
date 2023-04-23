package com.example.lovecalculater20.repository

import androidx.lifecycle.MutableLiveData
import com.example.lovecalculater20.data.model.LoveResults
import com.example.lovecalculater20.data.network.RetrofitBuilder
import timber.log.Timber

class MainRepository {

    var results = MutableLiveData<LoveResults>()

    suspend fun getResults(fname: String, sname: String) {
        results.value = RetrofitBuilder.apiService.getLoversResult(fname, sname)
        Timber.d(results.value.toString())
    }
}