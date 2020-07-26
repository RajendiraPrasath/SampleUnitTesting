package com.example.sampleunittesting

import android.os.Build
import android.view.View
import android.widget.Button
import android.widget.EditText
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [Build.VERSION_CODES.P])
internal class LoginActivityTest {
    private var activity:LoginActivity?=null
    private var email: EditText?=null
    private var password: EditText?=null
    private var button: Button?=null
    @Before
    fun setUp() {
        activity = Robolectric.setupActivity(LoginActivity::class.java)
        email = activity!!.findViewById(R.id.emailId)
        password = activity!!.findViewById(R.id.password)
        button = activity!!.findViewById(R.id.submit)
    }

    @Test
    fun onCreate() {
        assertNotNull("Email could not be found", email)
        assertNotNull("password could not be found", password)
        assertNotNull("Button could not be found", button)
    }

    @Test
    fun loginCheck()
    {
        button!!.performClick()
        email!!.setText("rajeee@gmail.com")
        password!!.setText("rajeee")
        assertEquals("Inavlid Email address",activity!!.emailValidator(email!!.text.toString()),true)
        assertEquals("Password Min 6 characters",activity!!.passwordValidator(password!!.text.toString()),true)
    }

    @After
    fun tearDown() {
        activity = null
    }
}