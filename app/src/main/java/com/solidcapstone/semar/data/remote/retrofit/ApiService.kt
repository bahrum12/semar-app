package com.solidcapstone.semar.data.remote.retrofit

import com.solidcapstone.semar.data.remote.response.PredictResponse
import com.solidcapstone.semar.data.remote.response.WayangResponse
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

interface ApiService {
    @Multipart
    @POST("https://wayang-prediction-mrlpwmp4cq-et.a.run.app/predict")
    fun postImage(
        @Part file: MultipartBody.Part,
    ): Call<PredictResponse>

    @POST("wayanglist")
    suspend fun getListWayang(): List<WayangResponse>

    @Multipart
    @POST("wayang")
    suspend fun getWayang(
        @Part("field_id") id: RequestBody,
    ): WayangResponse
}