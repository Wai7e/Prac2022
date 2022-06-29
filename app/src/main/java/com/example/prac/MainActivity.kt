package com.example.prac

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.example.prac.databinding.ActivityMainBinding
import org.w3c.dom.Text
import java.util.jar.Attributes

class MainActivity : AppCompatActivity() {
    lateinit var bindClass: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindClass.root)
        bindClass.button2.setOnClickListener{

            val height = bindClass.editTextNumberDecimal.text.toString().toDouble()
            val weight = bindClass.editTextNumberDecimal2.text.toString().toDouble()
            val age = bindClass.editTextNumberSigned3.text.toString().toDouble()
            val name = bindClass.editTextTextPersonName5.text.toString()
                if ((height > 0.0 && height < 250.0) && (weight > 0.0 && weight < 150.0)  && (age > 0.0 && age < 250.0)){
                    val result = bindClass.textView
                    val ex = (height * weight)%age
                    result.text = "$name\nstar range\nis $ex"
                }
                else{
                    val result = bindClass.textView
                    result.text = "Try again"
                }



        }
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }





}


