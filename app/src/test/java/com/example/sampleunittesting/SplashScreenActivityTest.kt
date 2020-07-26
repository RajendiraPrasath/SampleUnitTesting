package com.example.sampleunittesting

import android.os.Build
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import org.junit.After
import org.junit.Before
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [Build.VERSION_CODES.P])
internal class SplashScreenActivityTest {
    private var activity:SplashScreenActivity?=null
    var imageView : ImageView?=null
    var textView : TextView?=null
    @Before
    fun setUp() {
        activity = Robolectric.setupActivity(SplashScreenActivity::class.java)
        imageView = activity!!.findViewById(R.id.splashscreenimage)
        textView = activity!!.findViewById(R.id.splashscreentext)
    }

    @Test
    fun onCreate() {
        assertNotNull("Image could not be found",imageView)
        assertEquals("Image invisible",View.VISIBLE,imageView!!.visibility)
        assertNotNull("Text could not be found",textView)
        assertEquals("Text invisible",View.VISIBLE,textView!!.visibility)
    }

    @After
    fun tearDown() {
       activity=null
    }
}
