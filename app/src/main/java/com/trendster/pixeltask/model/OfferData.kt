package com.trendster.pixeltask.model

import android.annotation.SuppressLint
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@SuppressLint("ParcelCreator")
@Parcelize
data class OfferData(
    @SerializedName("products")
    val products: Products
) : Parcelable {

    @SuppressLint("ParcelCreator")
    @Parcelize
    data class Products(
        @SerializedName("dealsOfTheDay")
        val dealsOfTheDay: List<DealsOfTheDay>
    ) : Parcelable {
        @SuppressLint("ParcelCreator")
        @Parcelize
        data class DealsOfTheDay(
            @SerializedName("base_cat_id")
            val baseCatId: String,
            @SerializedName("brand")
            val brand: String,
            @SerializedName("cashback_use")
            val cashbackUse: String,
            @SerializedName("cat_id")
            val catId: String,
            @SerializedName("cat_pid")
            val catPid: String,
            @SerializedName("cgst")
            val cgst: String,
            @SerializedName("final_price")
            val finalPrice: String,
            @SerializedName("gstin")
            val gstin: String,
            @SerializedName("hot_deal_date")
            val hotDealDate: String,
            @SerializedName("hot_deal_img")
            val hotDealImg: String,
            @SerializedName("id")
            val id: String,
            @SerializedName("image_1")
            val image1: String,
            @SerializedName("images")
            val images: String,
            @SerializedName("logistics")
            val logistics: String,
            @SerializedName("main_price")
            val mainPrice: String,
            @SerializedName("mrp")
            val mrp: String,
            @SerializedName("name")
            val name: String,
            @SerializedName("percentage")
            val percentage: String,
            @SerializedName("pp_price")
            val ppPrice: String,
            @SerializedName("pp_price_final")
            val ppPriceFinal: String,
            @SerializedName("product_name")
            val productName: String,
            @SerializedName("product_uri")
            val productUri: String,
            @SerializedName("pv")
            val pv: String,
            @SerializedName("qty")
            val qty: String,
            @SerializedName("qty1")
            val qty1: String,
            @SerializedName("rating")
            val rating: Int,
            @SerializedName("sale_price")
            val salePrice: String,
            @SerializedName("support")
            val support: String,
            @SerializedName("warranty_preiod")
            val warrantyPreiod: String,
            @SerializedName("warranty_type")
            val warrantyType: String,
            @SerializedName("wishlist_status")
            val wishlistStatus: String
        ) : Parcelable
    }
}
