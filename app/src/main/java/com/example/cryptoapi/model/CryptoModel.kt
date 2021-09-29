package com.example.cryptoapi.model

import com.google.gson.annotations.SerializedName

data class CryptoModel(
    //@SerializedName("currency")  //alacağımız datadaki aynı ismi kullandığımız için serialize yazmamıza gerek yok ondan yoruma aldık
    val currency: String,
    //@SerializedName("price")  //alacağımız datadaki aynı ismi kullandığımız için serialize yazmamıza gerek yok ondan yoruma aldık
    val price: String)
