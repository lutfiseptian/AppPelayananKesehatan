package com.amd.apppelayanankesehatan.data.response

import com.amd.apppelayanankesehatan.data.model.ModelResults
import com.google.gson.annotations.SerializedName

class ModelResultNearby {

    @SerializedName("results")
    val modelResults: List<ModelResults> = emptyList()
}