package com.example.cryptoapi.service

import com.example.cryptoapi.model.CryptoModel
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET

interface CryptoAPI {

    //GET, POST, UPDATE, DELETE

    // https://api.nomics.com/v1/   //RETROFIT, base url'yi RETROFİT içine, aşağıdaki uzantı kısmı ise interface içine yazmamızı istiyor.
    // prices?key=25fc5041dac5da1d5411a9a9b3612f5e22677641

    @GET("prices?key=25fc5041dac5da1d5411a9a9b3612f5e22677641")
    fun getData(): Observable<List<CryptoModel>>


    //fun getData(): Call<List<CryptoModel>>



}