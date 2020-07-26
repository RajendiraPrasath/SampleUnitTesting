package com.example.sampleunittesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    private var email: EditText?=null
    private var password: EditText?=null
    private var button: Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)
        email = findViewById(R.id.emailId)
        password = findViewById(R.id.password)
        button = findViewById(R.id.submit)
        button!!.setOnClickListener {
            if(emailValidator(email!!.text.toString().trim())) {
                if(passwordValidator(password!!.text.toString().trim())) {
                    Toast.makeText(this,"Login Successfully",Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this,"Password min 6 characters",Toast.LENGTH_SHORT).show()
                }

            } else {
                Toast.makeText(this,"Invalid Email Address",Toast.LENGTH_SHORT).show()
            }
        }

    }
    fun emailValidator(email : String) : Boolean
    {

       return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
    fun passwordValidator(password : String) : Boolean
    {
        return password.length > 5
    }
}