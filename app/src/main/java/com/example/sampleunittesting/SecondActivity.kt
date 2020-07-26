package com.example.sampleunittesting

import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {
    var inUsername: EditText? = null
    var inNumber:EditText? = null
    var inConfirmNumber:EditText? = null
    var btnLogin: Button? = null
    var txtLoginResult: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        inUsername = findViewById(R.id.inUsername);
        inNumber = findViewById(R.id.inNumber);
        inConfirmNumber = findViewById(R.id.inConfirmNumber);
        btnLogin = findViewById(R.id.btnLogin);
        txtLoginResult = findViewById(R.id.txtLoginResult);
        btnLogin!!.setOnClickListener({
            if (TextUtils.isEmpty(inNumber!!.getText()))
                Toast.makeText(getApplicationContext(), "R.string.number_empty", Toast.LENGTH_SHORT).show();
            else if (!(inNumber!!.getText().toString().equals(inConfirmNumber!!.getText().toString())))
                Toast.makeText(getApplicationContext(), "R.string.toast_error", Toast.LENGTH_SHORT).show();
            else if (inUsername!!.getText().toString().trim().length == 0)
                Toast.makeText(getApplicationContext(), "R.string.username_empty", Toast.LENGTH_SHORT).show();
            else
                txtLoginResult!!.setText("Hello " + inUsername!!.getText().toString().trim());
        })

    }
}