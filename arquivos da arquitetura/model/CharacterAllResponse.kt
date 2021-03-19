package com.opah.desafio.felipe.models

import com.squareup.moshi.Json

data class CharacterAllResponse(
    @Json(name = "offset")
    var offset: Int,

    @Json(name = "limit")
    var limit: Int,

    @Json(name = "total")
    var total: Int,

    @Json(name = "count")
    var count: Int,

    @Json(name = "results")
    var results: List<CharacterResults>
)