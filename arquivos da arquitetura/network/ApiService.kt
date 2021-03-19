package com.opah.desafio.felipe.network.api

import com.opah.desafio.felipe.models.CharacterResponse
import com.opah.desafio.felipe.models.MarvelComicsResponse
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("v1/public/characters")
    fun getCharacters(): Deferred<Response<CharacterResponse>>


    @GET("v1/public/characters/{characterId}/comics")
    fun findComics(@Path("characterId") characterId: Int): Deferred<Response<MarvelComicsResponse>>
}
