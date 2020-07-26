package com.example.sampleunittesting


import android.content.Context
import androidx.test.InstrumentationRegistry.getTargetContext
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
/*
*
*
this is for rejendiraprasath reference
*
*
*/

@RunWith(AndroidJUnit4::class)
class MainActivityyTest {

    @Rule @JvmField
    val activityRule = ActivityTestRule(MainActivity::class.java)
    //var gf=IntentsTestRule()
    /*private var launchedActivity: MainActivity?=null
    @Before
    fun setUp() {

        launchedActivity = activityRule.activity
    }*/

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.sampleunittesting", appContext.packageName)
    }
    /*@Test fun listGoesOverTheFold() {
        onView(withText("Hello World!")).check(matches(isDisplayed()))
    }*/

    /*@After
    fun tearDown()
    {
        launchedActivity=null
    }*/


}