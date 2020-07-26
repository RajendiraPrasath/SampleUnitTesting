package com.example.sampleunittesting



/*import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test*/






import android.content.Intent
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import org.hamcrest.CoreMatchers.`is`
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.Shadows

import org.robolectric.annotation.Config
/*
*
*
this is for rejendiraprasath reference
*
*
*/


@RunWith(RobolectricTestRunner::class)
@Config(sdk = [Build.VERSION_CODES.P])
class MainActivityTest {

    private var activity:MainActivity?=null
    var a:Int =0
    var b:Int=0
    var view : View?=null
    @Before
    fun setUp() {
        activity = Robolectric.setupActivity(MainActivity::class.java)
        //View view = LayoutInflater.from(activity).inflate(R.layout.myView, null);
        view=LayoutInflater.from(activity).inflate(R.layout.activity_main,null)

        //activity=MainActivity()

        a=10
        b=20

    }

    @After
    fun tearDown() {
        activity = null
        a=0
        b=0
    }

    @Test
    fun helloWorld() {
        assertEquals("Hello, prasath", activity!!.helloWorld("prasath"))
    }
    @Test
    fun compare()
    {

        var f :Boolean=activity!!.compare(a,b)
        assertEquals(f,false)
    }
    @Test
    fun setText()
    {
        activity!!.setTextTextView("Rajendiraprasath")
        val tvHelloWorld = activity!!.findViewById<View>(R.id.emptytext) as TextView
        assertNotNull("TextView could not be found", tvHelloWorld)
        assertTrue(
            "TextView contains incorrect text",
            "Rajendiraprasath" == tvHelloWorld.text.toString()
        )

    }
    @Test
    fun callSecondActivity()
    {
        activity!!.findViewById<View>(R.id.nextacticity).performClick()
        val expectedIntent = Intent(activity, SecondActivity::class.java)
        val shadowActivity = Shadows.shadowOf(activity)
        val actualIntent = shadowActivity.nextStartedActivity
        assertTrue(actualIntent.filterEquals(expectedIntent))
    }
    @Test
    fun imageTest()
    {
        val imageView= activity!!.findViewById<View>(R.id.imagetest)
        assertNotNull("Could Not found",imageView)
        assertEquals(View.VISIBLE,imageView.visibility)
        //val drawableResId: Int = Shadows.shadowOf(imageView.background).createdFromResId
        /*assertThat(
            "error image drawable",
            R.drawable.ic_sentiment_dissatisfied_white_144dp,
            `is`(equalTo(drawableResId))
        )*/
        //assertEquals(R.mipmap.ic_launcher_round, imageView.id)
        //shadowOf(imageView.getBackground()).getCreatedFromResId()
        /*assertThat(
            "error image drawable", R.drawable.ic_launcher_background,
            `is`(drawableResId)
        )
        val drawableResId: Int = Shadows.shadowOf(imageView.getBackground()).getCreatedFromResId()
        assertThat(
            "error image drawable",
            R.drawable.ic_sentiment_dissatisfied_white_144dp,
            `is`(equalTo(drawableResId))
        )*/
    }



}