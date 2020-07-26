package com.example.sampleunittesting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

var textView:TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nextacticity.setOnClickListener({
            var intent=Intent(this@MainActivity,SecondActivity::class.java)
            startActivity(intent)
        })
    }
    fun helloWorld(name: String = "World"): String {
        return "Hello, ${name}"
    }
    fun compare(a: Int ,b: Int): Boolean{
        if(a>=b)
        {
            return true
        }
        return false
    }
    fun setTextTextView(name: String)
    {
        textView=findViewById(R.id.emptytext) as TextView
        textView!!.text=name
    }
}