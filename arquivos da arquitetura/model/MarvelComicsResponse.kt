package com.opah.desafio.felipe.models

import com.google.gson.annotations.SerializedName

data class MarvelComicsResponse(
    @SerializedName("data") val heroData: MarvelComicsData
) : MarvelCommonResponse()