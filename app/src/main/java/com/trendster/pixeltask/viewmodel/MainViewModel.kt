package com.trendster.pixeltask.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.trendster.pixeltask.model.OfferData
import com.trendster.pixeltask.repository.RemoteDataSource
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val remoteDataSource = RemoteDataSource()
    val responseData = MutableLiveData<OfferData>()

    fun getData() {
        viewModelScope.launch {
            try {
                val response = remoteDataSource.getData()
                responseData.postValue(response.body())
                Log.d("TestError11", response.body().toString())

                // responseData.postValue(response)
            } catch (e: Exception) {
                Log.d("TestError", e.message.toString())
            }
        }
    }
}
