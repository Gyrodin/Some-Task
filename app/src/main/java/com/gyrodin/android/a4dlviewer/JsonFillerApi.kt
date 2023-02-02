package com.gyrodin.android.a4dlviewer

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface JsonFillerApi {
    @GET("{section}/{page_number}?json=true")
    fun get_PostGif(@Path("section") section: String,
                    @Path("page_number") page_number: Int): Call<PostResponse>
}