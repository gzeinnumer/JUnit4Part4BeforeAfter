package com.gzeinnumer.junit4part4beforeafter

import android.content.Context

//todo 1
class ResourceComperer {
    fun isEquals(context: Context, resId: Int, string: String) : Boolean{
        return context.getString(resId) == string
    }
}