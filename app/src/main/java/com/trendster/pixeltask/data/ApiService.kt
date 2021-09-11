package com.trendster.pixeltask.data

import com.trendster.pixeltask.model.OfferData
import retrofit2.Response
import retrofit2.http.POST

interface ApiService {

    @POST("vynkpay_store/api/dashboard")
    suspend fun getData(): Response<OfferData>
}
