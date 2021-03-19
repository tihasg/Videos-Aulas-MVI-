package com.opah.desafio.felipe.models

import com.google.gson.annotations.SerializedName

data class CharacterResponse(
    @SerializedName("data")
    var allResponse: CharacterAllResponse
)