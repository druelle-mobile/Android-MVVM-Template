package ovh.geoffrey_druelle.android_mvvm_template.data.remote.api

import ovh.geoffrey_druelle.android_mvvm_template.data.remote.model.GenericApiModel
import ovh.geoffrey_druelle.android_mvvm_template.utils.DATASET
import retrofit2.Call
import retrofit2.http.GET

interface GenericApi {

    @GET("?dataset=$DATASET&rows=10")
    fun getTenRows(): Call<GenericApiModel>
}
