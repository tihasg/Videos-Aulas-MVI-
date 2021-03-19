package com.opah.desafio.felipe.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Prices : Serializable{

    @SerializedName("type")
    var type: String = ""
    @SerializedName("price")
    var price: Double = 0.0
}
