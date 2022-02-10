package com.gzeinnumer.junit4part4beforeafter

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

//todo 2
//@Before @Test @After
class ResourceCompererTest{
    lateinit var resourceComperer : ResourceComperer

    @Before
    fun setup(){
        resourceComperer = ResourceComperer()
    }

    @After
    fun tearDown(){

    }

    @Test
    fun stringResourceSameAsGivenString_returnsTrue(){
        val context =  ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComperer.isEquals(context, R.string.app_name, "JUnit4Part4BeforeAfter")

        assertThat(result).isTrue()
    }

    @Test
    fun stringResourceDifferentAsGivenString_returnsFalse(){
        val context =  ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComperer.isEquals(context, R.string.app_name, "beda dengan hasil")

        assertThat(result).isFalse()
    }
}