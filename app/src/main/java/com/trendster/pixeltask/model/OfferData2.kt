package com.trendster.pixeltask.model


import com.google.gson.annotations.SerializedName

data class OfferData2(
    @SerializedName("appLogoUrl")
    val appLogoUrl: String,
    @SerializedName("base_url")
    val baseUrl: String,
    @SerializedName("menu_categories")
    val menuCategories: List<MenuCategory>,
    @SerializedName("message")
    val message: String,
    @SerializedName("offer_data")
    val offerData: OfferData,
    @SerializedName("products")
    val products: Products,
    @SerializedName("rpk")
    val rpk: String,
    @SerializedName("slider")
    val slider: Slider,
    @SerializedName("status")
    val status: Int,
    @SerializedName("tot_cart_item")
    val totCartItem: String,
    @SerializedName("tot_wishlist_item")
    val totWishlistItem: String
) {
    data class MenuCategory(
        @SerializedName("id")
        val id: String,
        @SerializedName("image")
        val image: String,
        @SerializedName("level")
        val level: String,
        @SerializedName("name")
        val name: String,
        @SerializedName("pid")
        val pid: String,
        @SerializedName("uri_name")
        val uriName: String
    )

    data class OfferData(
        @SerializedName("category_offers")
        val categoryOffers: List<Any>,
        @SerializedName("product_offers")
        val productOffers: List<Any>
    )

    data class Products(
        @SerializedName("dealsOfTheDay")
        val dealsOfTheDay: List<DealsOfTheDay>,
        @SerializedName("featuredProducts")
        val featuredProducts: List<FeaturedProduct>,
        @SerializedName("homeAndLivingProdcuts")
        val homeAndLivingProdcuts: List<Any>,
        @SerializedName("newProducts")
        val newProducts: List<NewProduct>
    ) {
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
            val rating: Float,
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
        )

        data class FeaturedProduct(
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
            val rating: Float,
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
        )

        data class NewProduct(
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
        )
    }

    data class Slider(
        @SerializedName("middlesliderdata")
        val middlesliderdata: List<Middlesliderdata>,
        @SerializedName("topsliderdata")
        val topsliderdata: List<Topsliderdata>
    ) {
        data class Middlesliderdata(
            @SerializedName("cat_id")
            val catId: String,
            @SerializedName("id")
            val id: String,
            @SerializedName("image")
            val image: String,
            @SerializedName("img_text")
            val imgText: String,
            @SerializedName("link")
            val link: String,
            @SerializedName("slider_title")
            val sliderTitle: String
        )

        data class Topsliderdata(
            @SerializedName("cat_id")
            val catId: String,
            @SerializedName("id")
            val id: String,
            @SerializedName("image")
            val image: String,
            @SerializedName("img_text")
            val imgText: String,
            @SerializedName("link")
            val link: String,
            @SerializedName("slider_title")
            val sliderTitle: String
        )
    }
}