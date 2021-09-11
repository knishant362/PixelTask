package com.trendster.pixeltask.data

import com.trendster.pixeltask.model.OfferData
import com.trendster.pixeltask.model.OfferData2
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {

    @POST("vynkpay_store/api/dashboard")
    suspend fun getData(): Response<OfferData2>
}
